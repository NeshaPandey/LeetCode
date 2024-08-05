class Solutions:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        distArr=[]
        for i in arr:
            if(arr.count(i) == 1):
                distArr.append(i)
        try:
            k=k-1
            return distArr[k]
        except:
            return ""
