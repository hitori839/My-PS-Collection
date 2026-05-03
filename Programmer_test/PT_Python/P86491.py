# 2020 카카오 인턴십 - 최소 직사각형
def solution(sizes):
    ga_max = 0
    se_max = 0
    # 가로와 세로 중 큰 수를 가로로, 작은 수를 세로로 생각하여 최대값을 구한다.
    for i in sizes:
        if i[0] < i[1]:
            i[0], i[1] = i[1], i[0]
        if ga_max < i[0]:
            ga_max = i[0]
        if se_max < i[1]:
            se_max = i[1]
    
    return ga_max * se_max

# 테스트 케이스
print(solution([[60, 50], [30, 70], [60, 30], [80, 40]])) # 4000
print(solution([[10, 7], [12, 3], [5, 15], [7, 8]])) # 120
print(solution([[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]])) # 133   