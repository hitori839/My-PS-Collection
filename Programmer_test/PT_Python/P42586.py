# 기능개발
import math

def solution(progresses, speeds):
    answer = []
    com_time = []
    # 각 작업이 완료되는 시간을 계산하여 리스트에 저장
    for i in range(len(progresses)):
        ti = math.ceil((100-progresses[i])/speeds[i])
        com_time.append(ti)

    # 첫 번째 작업의 완료 시간을 기준으로 작업들을 그룹화하여 배포
    work = com_time[0]
    complete = 1

    # 이후 작업들의 완료 시간을 비교하여 배포할 작업 수를 계산
    for i in range(1,len(progresses)):
        # 현재 작업의 완료 시간이 기준 작업의 완료 시간보다 작거나 같으면 같은 배포에 포함
        if (com_time[i] <= work):
            complete += 1
        # 현재 작업의 완료 시간이 기준 작업의 완료 시간보다 크면 새로운 배포가 필요하므로 이전 배포에 포함된 작업 수를 결과 리스트에 추가하고, 새로운 배포를 시작
        else:
            answer.append(complete)
            complete = 1
            work = com_time[i]
    # 마지막 배포에 포함된 작업 수를 결과 리스트에 추가
    answer.append(complete)
    return answer

progresses = [93, 30, 55]
speeds = [1, 30, 5]
print(solution(progresses, speeds))