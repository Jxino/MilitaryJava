package scheduler;

import java.util.Scanner;

public class SchedulerTest {
    public static void main(String[] args) {
        printMenu();
        
        Scheduler scheduler = null;
        
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim().toUpperCase();

        switch (input) {
            case "R":
                scheduler = new RoundRobin();
                break;
            case "L":
                scheduler = new LeastJob();
                break;
            case "P":
                scheduler = new PriorityAllocation();
                break;
            default:
                System.out.println("지원되지 않는 기능입니다.");
                break;
        }

        if (scheduler != null) {
            scheduler.getNextCall();
            scheduler.sendCallToAgent();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("전화 상담 할당 방식을 선택하세요.");
        System.out.println("R : 한 명씩 차례로 할당 "); 
        System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");    
        System.out.println("P : 우선 순위가 높은 고객 먼저 할당 ");
    }
}
