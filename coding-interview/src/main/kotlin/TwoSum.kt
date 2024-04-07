class TwoSum {
    companion object {

        fun twoSumWithForLoop(nums: IntArray, target: Int): IntArray {
            val result = IntArray(2)
            for (i in nums.indices) {
                for (j in i + 1 until nums.size){
                    if(nums[i] +  nums[j] == target){
                        result[0] = nums[i]
                        result[1] = nums[j]
                        println("Result [" + result.get(0) + ", " + result.get(1) + "] ")
                        return result
                    }
                }
            }
            return result
        }
        fun twoSumWithHashmap(nums: IntArray, target: Int): IntArray{
            val result = IntArray(2)
            val hashMap = HashMap<Int, Int>()
            for(i in nums.indices) {
                val numberTmp = target - nums[i]
                if(hashMap.containsKey(numberTmp)){
                    result[0] = hashMap[numberTmp]!!
                    result[1] = i
                    println("Result [" + result.get(0) + ", " + result.get(1) + "] ")
                    return result
                }
                hashMap[nums[i]] = i

            }
            return result
        }
    }

}