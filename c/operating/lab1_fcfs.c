#include <stdio.h>
void find_wating_time(int process[], int n, int bt[], int wt[]){
    //wt[]=0;
    for(int i=1;i<n;i++){
        wt[i]=bt[i-1]+wt[i-1];
    }

}
void find_turn_around(int process[], int n, int bt[],int wt[], int tat[]){
    for(int i=0; i<n; i++){
        tat[i]=bt[i]+wt[i];
    }
}

void average_wating_time(int process[],int n, int b_t[]){
    int wt[n],tat[n],total_wt=0, total_tat=0;
    find_wating_time(process,n,b_t,wt);
    find_turn_around(process,n,b_t,wt,tat);

    printf("Process       brust time     wating time     turn around time  \n");
    for(int i=0; i<n; i++){
        total_wt +=wt[i];
        total_tat += tat[i];
        printf(" %d \t\t %d \t\t %d\n",i+1,b_t[i],wt[i],tat[i]);
    }
    float  avg_wt= (float)total_wt/n;
    float  avg_tat= (float)total_tat/n;
    printf("\n Average wating time : %2f ",avg_wt);
    printf("\n Average turn around  time : %2f ",avg_tat);


}

int main(){
    int n;
    printf("Enter the number of Process :");
    scanf("%d ",&n);
    int brust_time[n];
    printf("\nEnter the CPU brust time each Process :\n");
    for(int i=0; i<n;i++){
        printf("Enter brust time for process %d : ",i+1);
        scanf("%d \n ",&brust_time[i]);
    }
    int process[n];
    for(int i=0; i<n;i++){
        process[i]=i+1;
    }
    average_wating_time(process,n,brust_time);
    return 0;

}