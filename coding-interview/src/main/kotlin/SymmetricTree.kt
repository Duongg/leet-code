class SymmetricTree {

    companion object {
        fun isSymmetric(root: TreeNode?): Boolean {
            if(root == null) return true
            return helper(root.left, root.right)
        }

        private fun helper(left: TreeNode?, right: TreeNode?) : Boolean {
            if(left == null && right == null) return true
            if(left == null || right == null || left.`val` != right.`val`) return false
            return helper(left.left, right.right) && helper(left.right, right.left)
        }
    }


}