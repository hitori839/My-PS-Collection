def solution(s):
    ep = 0
    ey = 0

    for i in range(len(s)):
        if ((s[i] == 'p') or (s[i] == 'P')):
            ep += 1
        if ((s[i] == 'y') or (s[i] == 'Y')):
            ey += 1
    if ep == ey:
        return True
    else:
        return False
    
print(solution("pPoooyY"))
print(solution("Pyy"))
print(solution("AAA"))