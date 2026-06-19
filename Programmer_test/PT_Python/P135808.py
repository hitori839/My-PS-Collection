# 내림차순 정렬 함수 (자바의 sort 메서드와 매칭)
def solution(k, m, score):
    # 총이익을 담을 변수 
    answer = 0
    
    # 1 & 2. 사과 점수를 내림차순 정렬
    score.sort(reverse=True)
    
    # 상자 포장을 시작할 인덱스 포인터 변수
    nbox = 0
    
    # 남은 사과의 개수가 한 상자를 채울 수 있을 때(m개 이상)까지만 반복
    while (nbox + m <= len(score)):
        # 현재 상자에서 가장 낮은 점수(내림차순 배열의 nbox + m - 1 번째) * m 을 정답에 누적
        answer += score[nbox + m - 1] * m
        
        # 다음 상자로 넘어가기 위해 m만큼 인덱스 이동
        nbox += m
        
    return answer

print(solution(3, 4, [1, 2, 3, 1, 2, 3, 1]))
print(solution(4, 3, [4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]))