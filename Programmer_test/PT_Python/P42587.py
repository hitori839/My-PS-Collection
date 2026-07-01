from collections import deque

def solution(priorities, location):
    # 1. (우선순위, 원본 인덱스)를 함께 저장할 큐 선언
    queue = deque([(val, i) for i, val in enumerate(priorities)])
    
    # 2. 최댓값을 빠르게 찾기 위해 우선순위 리스트 정렬
    priorities.sort()
    
    # 정렬된 리스트의 맨 뒤(가장 큰 값)를 가리키는 인덱스 포인터
    m_index = len(priorities) - 1
    order = 0 # 실행 순서 카운터
    
    # 3. 큐가 빌 때까지 시뮬레이션 진행
    while queue:
        current = queue.popleft()
        
        # 현재 꺼낸 프로세스가 남은 대기 프로세스 중 가장 우선순위가 높은가?
        if current[0] == priorities[m_index]:
            order += 1       # 프로세스 실행 완료
            m_index -= 1     # 다음으로 높은 우선순위로 타겟 변경
            
            # 만약 방금 실행한 프로세스가 내가 찾던 프로세스라면 즉시 리턴
            if current[1] == location:
                return order
        else:
            # 더 높은 우선순위가 존재하므로 다시 큐의 맨 뒤로 이동
            queue.append(current)
            
    return order

# 테스트 케이스 실행
print(solution([1, 1, 9, 1, 1, 1], 0)) # 5