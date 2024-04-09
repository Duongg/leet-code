class TwoSumII {
    companion object {
        fun calculateTwoSum(numbers: IntArray, target: Int): IntArray{
            val result = IntArray(2)
            var start = 0
            var end = numbers.size - 1
            while (start < end) {
                if(numbers[start] + numbers[end] == target) {
                    result[0] = start + 1
                    result[1] = end + 1
                    println("Result [" + result.get(0) + ", " + result.get(1) + "] ")
                    return result
                }else if(numbers[start] + numbers[end] > target){
                    end--
                }else{
                    start++
                }
            }
            return result
        }
    }
}