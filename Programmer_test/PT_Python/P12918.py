def solution(s):
    if (len(s) == 4) or (len(s) == 6):
        for i in s:
            if 'a' <= i <= 'z':
                return False
            elif 'A' <= i <= 'Z':
                return False
        return True
    else:
        return False
    
print(solution("a234"))
print(solution("1234"))