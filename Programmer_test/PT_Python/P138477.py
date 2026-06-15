# 내림차순 정렬 함수
def sort(arr):
    # 파이썬의 기본 정렬 (오름차순)
    arr.sort()
    
    # 배열의 앞뒤를 뒤집어서 내림차순으로 변경 
    for i in range(len(arr) // 2):
        temp = arr[i]
        arr[i] = arr[len(arr) - 1 - i]
        arr[len(arr) - 1 - i] = temp
        
    return arr

# 솔루션 함수 
def solution(k, score):
    # 정답을 담을 리스트 
    answer = [0] * len(score)
    # 명예의 전당 리스트
    Hof = [0] * (k + 1)
    
    # score 리스트의 길이만큼 반복
    for i in range(len(score)):
        # 명예의 전당 맨 마지막 칸(인덱스 k)에 새 점수를 배치
        Hof[k] = score[i]
        # 배열을 내림차순 정렬
        Hof = sort(Hof)
        
        # i가 k보다 작을 때 (명예의 전당이 아직 다 안 찼을 때)
        if i < k:
            # 원본 자바 로직 구조를 그대로 따르되, 
            # 초기값 0이 정답에 영향을 주지 않도록 i번째 점수가 들어간 위치의 값을 동적으로 매칭합니다.
            answer[i] = Hof[i]
        # 명예의 전당이 꽉 찼을 때
        else:
            # k번째 순위인 인덱스 k-1의 값을 정답에 저장
            answer[i] = Hof[k - 1]
            
    return answer

# 테스트 실행
print(solution(3, [10, 100, 20, 150, 1, 100, 200]))
print(solution(4, [0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]))