def solution(arr):
    arr_min = min(arr)
    if len(arr) <= 1:
        return [-1]
    arr.remove(arr_min)
    return arr

print(solution([4,3,2,1]))
print(solution([10]))
print(solution([1,2,3,4]))