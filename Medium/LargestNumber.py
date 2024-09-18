class LargestNumber:
    def largestNumber(self, nums: List[int]) -> str:
        #Input: nums = [10,2]
        #Output: "210"
        num=list(map(str,nums))
        def compare(x,y):
            if x+y>y+x:
                return -1
            elif x+y<y+x:
                return 1
            else:
                return 0

        num.sort(key=cmp_to_key(compare))
        if num[0] == '0':
            return '0'
        largest_num = ''.join(num)
        return largest_num
