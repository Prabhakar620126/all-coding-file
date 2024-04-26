#include <stdio.h>

void fcfs(int processes[], int n, int burst_time[]) {
    int waiting_time = 0;
    int turnaround_time = 0;
    printf("FCFS Scheduling:\n");
    printf("  Process \t Arrival time \t Service Time\t Waiting Time \t Turnaround Time");

    
    for (int i = 0; i < n; i++) {
        turnaround_time += burst_time[i];
        printf("%d \t\t %d \t\t  %d \t\t %d \t\t %d \t\t \n",processes[i],i,burst_time[i],waiting_time, turnaround_time);
        // printf("Process %d:\n", processes[i]);
        // printf("\tArrival Time: %d\n", i);
        // printf("\tService Time: %d\n", burst_time[i]);
        // printf("\tWaiting Time: %d\n", waiting_time);
        // printf("\tTurnaround Time: %d\n", turnaround_time);
        waiting_time += burst_time[i];
    }

    printf("\nAverage Waiting Time: %.2f\n", (float)waiting_time / n);
}

int main() {
    int processes[] = {1, 2, 3, 4};
    int n = sizeof(processes) / sizeof(processes[0]);
    int burst_time[] = {5, 3, 6, 2};

    fcfs(processes, n, burst_time);

    return 0;
}
