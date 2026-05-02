# 같은 숫자는 싫어
def solution(arr):
    answer = []
    # [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    answer = [arr[0]]
    # 이전에 넣은 숫자와 현재 숫자가 다르면 answer에 추가
    for i in range(1, len(arr)):
        if arr[i] != arr[i-1]:
            answer.append(arr[i])
    return answer

print(solution([1, 1, 3, 3, 0, 1, 1]))