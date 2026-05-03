# K번째 수
def solution(array, commands):
    answer = []
    for i in commands:
        # i[0]부터 i[1]까지 자르고 정렬한 다음, i[2]번째 수를 구하기
        a = array[i[0]-1:i[1]]
        a.sort()
        answer.append(a[i[2]-1])
    return answer

print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))