def solution(dartResult):
    answer = 0
    temp = [0, 0, 0]  # int[] temp = {0, 0, 0};
    t_ind = -1        # int t_ind = -1;
    
    # Java의 for (int i = 0; i < dartResult.length(); i++)와 동일한 흐름
    i = 0
    for _ in range(len(dartResult)):
        if i >= len(dartResult):  # 인덱스가 범위를 벗어나면 종료 (i++ 건너뛰기 대응)
            break
            
        ind = dartResult[i]  # char ind = dartResult.charAt(i);
        
        # 1. 숫자인 경우 ('0' <= ind) && (ind <= '9')
        if '0' <= ind <= '9':
            t_ind += 1
            temp[t_ind] = ord(ind) - ord('0')  # ind - '0' (문자 아스키코드 연산 구현)
            
            # if (dartResult.charAt(i+1) == '0')
            if i + 1 < len(dartResult) and dartResult[i+1] == '0':
                i += 1  # i++; (인덱스 강제 증가)
                temp[t_ind] = 10
                
        # 2. 보너스 및 옵션 처리
        else:
            if ind == 'S':
                temp[t_ind] = Sin(temp[t_ind])
            elif ind == 'D':
                temp[t_ind] = Dou(temp[t_ind])
            elif ind == 'T':
                temp[t_ind] = Tri(temp[t_ind])
            elif ind == '*':
                if t_ind >= 1:
                    temp[t_ind] = Star(temp[t_ind])
                    temp[t_ind-1] = Star(temp[t_ind-1])
                else:
                    temp[t_ind] = Star(temp[t_ind])
            elif ind == '#':
                temp[t_ind] = Hash(temp[t_ind])
                
        i += 1  # Java for문의 i++ 역할을 수동으로 수행

    # for (int i = 0; i < 3; i++) { answer += temp[i]; }
    for i in range(3):
        answer += temp[i]
        
    return answer

# 하단 메서드(함수) 구조도 완전히 동일하게 유지
def Sin(m):
    return m

def Dou(m):
    return m * m

def Tri(m):
    return m * (m * m)

def Star(m):
    return m * 2

def Hash(m):
    return (-1) * m


print(solution("1S2D*3T"))
print(solution("1D2S#10S"))
print(solution("1D2S0T"))
print(solution("1S*2T*3S"))
print(solution("1D#2S*3S"))
print(solution("1T2D3D#"))
print(solution("1D2S3T*"))