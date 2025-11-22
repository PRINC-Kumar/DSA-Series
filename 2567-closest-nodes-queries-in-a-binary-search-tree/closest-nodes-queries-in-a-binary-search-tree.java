class Solution {

    // inorder to get sorted values
    public void inorder(TreeNode root, List<Integer> l) {
        if (root == null) return;
        inorder(root.left, l);
        l.add(root.val);
        inorder(root.right, l);
    }

    
    public int findFloor(List<Integer> l, int q) {
        int s = 0, e = l.size() - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (l.get(mid) <= q) {
                ans = l.get(mid);  
                s = mid + 1;      
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }


    public int findCeil(List<Integer> l, int q) {
        int s = 0, e = l.size() - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (l.get(mid) >= q) {
                ans = l.get(mid);  
                e = mid - 1;       
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<Integer> inorderList = new ArrayList<>();
        inorder(root, inorderList);

        List<List<Integer>> ans = new ArrayList<>();

        for (int q : queries) {
            int floor = findFloor(inorderList, q);
            int ceil  = findCeil(inorderList, q);

            ans.add(Arrays.asList(floor, ceil));
        }

        return ans;
    }
}
