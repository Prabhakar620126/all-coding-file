#include <stdio.h>
#include <stdlib.h>
struct fcfs
{
    int pid;
    int btime;
    int wtime;
    int ttime;
} p[10];
int main()
{
    int i, n;
    int towtwtime = 0, totttime = 0;
    printf("\n FCFS scheduling...\n");
    printf("Enter the no of process  :");
    scanf("%d", &n);

    printf("\n Input the values one by one for each process :");
    for (i = 0; i < n; i++)
    {
        p[i].pid = 1;
        printf("\n Burst time of the process :");
        scanf("%d", &p[i].btime);
    }
    p[0].wtime = 0;
    p[0].ttime = p[0].btime;
    totttime += p[i].ttime;
    for (i = 0; i < n; i++)
    {
        p[i].wtime = p[i - 1].wtime + p[i - 1].btime;
        p[i].ttime = p[i].wtime + p[i].btime;
        totttime += p[i].ttime;
        towtwtime += p[i].wtime;
    }

    printf("\n waiting time for process");
    printf("\n total waiting time :%d", towtwtime);
    printf("\n average waiting time :%f", (float)towtwtime / n);
    printf("\n");
    printf("\n turn around time for process");
    printf("\n total turn around time :%d", totttime);
    printf("\n average turn around time: :%f", (float)totttime / n);

    printf("\n");
}