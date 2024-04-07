class InvertTree {
    companion object {
        fun invertTree(root: TreeNode?): TreeNode? {
            // base case
            if(root == null) return null

            // others case
            val tmp: TreeNode? = root.left
            root.left = root.right
            root.right = tmp

            invertTree(root.left)
            invertTree(root.right)
            return root
        }
    }

}