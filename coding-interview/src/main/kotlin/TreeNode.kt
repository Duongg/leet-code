class TreeNode (var `val`: Int){
    var left: TreeNode? = null
    var right: TreeNode? = null

    override fun toString(): String {
        return "TreeNode(`val`=$`val`, left=$left, right=$right)"
    }

}

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result: IntArray = intArrayOf()
        for(i in 0 until nums.size){
            for(j in i + 1 until nums.size){
                if(nums.get(i) + nums.get(j) == target){
                    result[0] = i
                    result[1] = j
                    return result
                }
            }
        }
        return result
    }
}