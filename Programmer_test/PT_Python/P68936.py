def solution(arr):
    answer = [0, 0]

    # 현재 영역이 압축 가능한지 검사하는 함수
    def check(sub_arr):
        n = len(sub_arr)
        
        # 더 이상 쪼갤 수 없는 크기 1x1 배열인 경우 (Base Case)
        if n == 1:
            answer[sub_arr[0][0]] += 1
            sub_arr[0][0] = 2 # 방문 처리용 마킹
            return

        first_val = sub_arr[0][0]
        # 전체 영역을 돌며 첫 원소와 다른 값이 있는지 검사
        for i in range(n):
            for j in range(n):
                # 첫 원소와 다른 값이 섞여 있다면 압축 불가 -> 4등분 슬라이싱
                if sub_arr[i][j] != first_val and first_val != 2:
                    slice_arr(sub_arr)
                    return
                    
        # 모두 같은 숫자로 이루어져 있다면 압축 성공
        answer[first_val] += 1
        for i in range(n):
            for j in range(n):
                sub_arr[i][j] = 2 # 사용 완료 마킹

    # 배열을 정확히 4개의 사분면 영역으로 쪼개어 각각 재귀 검사하는 함수
    def slice_arr(sub_arr):
        half = len(sub_arr) // 2
        
        # 1. 좌상단 (Top-Left) 영역 슬라이싱 및 재귀 호출
        top_left = [row[:half] for row in sub_arr[:half]]
        check(top_left)
        
        # 2. 좌하단 (Bottom-Left) 영역 슬라이싱 및 재귀 호출
        bottom_left = [row[:half] for row in sub_arr[half:]]
        check(bottom_left)
        
        # 3. 우상단 (Top-Right) 영역 슬라이싱 및 재귀 호출
        top_right = [row[half:] for row in sub_arr[:half]]
        check(top_right)
        
        # 4. 우하단 (Bottom-Right) 영역 슬라이싱 및 재귀 호출
        bottom_right = [row[half:] for row in sub_arr[half:]]
        check(bottom_right)

    check(arr)
    return answer

# 테스트 케이스 실행
print(solution([[1,1],[1,0]])) # [1, 3]
print(solution([[1,1,0,0],[1,0,0,0],[1,0,0,1],[1,1,1,1]])) # [4, 9]
print(solution([[1,1,1,1,1,1,1,1],[0,1,1,1,1,1,1,1],[0,0,0,0,1,1,1,1],[0,1,0,0,1,1,1,1],[0,0,0,0,0,0,1,1],[0,0,0,0,0,0,0,1],[0,0,0,0,1,0,0,1],[0,0,0,0,1,1,1,1]])) #[10, 15]