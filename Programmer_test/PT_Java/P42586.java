// 기능개발
public class P42586 {
    public static void main(String[] args) {
        P42586 sol = new P42586();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] result = sol.solution(progresses, speeds);
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] com_time = new int[progresses.length];
        // 각 작업이 완료되는 시간을 계산하여 배열에 저장
        for (int i=0; i<progresses.length; i++) {
            com_time[i] = (int) Math.ceil((100.0-progresses[i])/speeds[i]);
        }
        // 첫 번째 작업의 완료 시간을 기준으로 작업들을 그룹화하여 배포
        int work = com_time[0];
        int complete = 1;
        // 이후 작업들의 완료 시간을 비교하여 배포할 작업 수를 계산
        for (int i=1; i<progresses.length; i++) {
            // 현재 작업의 완료 시간이 기준 작업의 완료 시간보다 작거나 같으면 같은 배포에 포함
            if (com_time[i] <= work) {
                complete += 1;
            }
            // 현재 작업의 완료 시간이 기준 작업의 완료 시간보다 크면 새로운 배포가 필요하므로 이전 배포에 포함된 작업 수를 결과 배열에 추가하고, 새로운 배포를 시작 
            else {
                answer = append(answer, complete);
                complete = 1;
                work = com_time[i];
            }
        }
        // 마지막 배포에 포함된 작업 수를 결과 배열에 추가
        answer = append(answer, complete);
        return answer;
    }

    // 배열에 값을 추가하는 메서드
    // 이렇게 하는 이유는 Java에서는 배열의 크기가 고정되어 있기 때문에, 새로운 값을 추가하려면 기존 배열보다 크기가 1 더 큰 새 배열을 만들어야 하기 때문입니다.
    private int[] append(int[] arr, int value) {
        // 1. 기존 배열보다 길이가 1 더 큰 새 배열 생성
        int[] newArr = new int[arr.length + 1];

        // 2. arr의 모든 내용을 newArr로 복사 (0번부터 끝까지)
        System.arraycopy(arr, 0, newArr, 0, arr.length);

        // 3. 복사하고 남은 마지막 빈 칸(인덱스 arr.length)에 새로운 값 저장
        // (예: 기존 길이가 3이면 인덱스는 0, 1, 2였고 새 인덱스는 3이 마지막)
        newArr[arr.length] = value;

        // 4. 완성된 새 배열 반환
        return newArr;
    }
}