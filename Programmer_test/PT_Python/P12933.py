def solution(n):
    temp = f'{n}'
    c_str = sorted(temp, reverse=True)
    str_s = ""
    for i in c_str:
        str_s += i
    answer = int(str_s)
    return answer

print(solution(118372))