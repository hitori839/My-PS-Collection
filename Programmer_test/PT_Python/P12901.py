def solution(a, b):
    week = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
    month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    d = 0
    for i in range(a-1):
        d += month[i]
    d += b
    answer = week[(d + 4) % 7]
    return answer

print(solution(5, 24))