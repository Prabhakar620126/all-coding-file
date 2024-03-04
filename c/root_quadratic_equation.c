#include<stdio.h>
#include<math.h>
int main (){
    printf("Enter quadratic equation :\n");
    int a,b,c; // a is cofficient of x^2  , b is cofficient of x and c is constant term
    printf(" Enter the cofficient of x^2:"); // (a)x^2+(b)x+(c)=0
    scanf("%d",&a);
    printf(" Enter the cofficient of x :"); // (a)x^2+(b)x+(c)=0
    scanf("%d",&b);
    printf(" Enter the constant :"); // (a)x^2+(b)x+(c)=0
    scanf("%d",&c);
    printf("THE ENTER EQUATION IS : (%dx^2)+(%dx)+(%d)=0\n",a,b,c);
    float x1 ,x2,D , realPart, imaginaryPart ; // root of equation 
    D= (b*b -4*a*c);
    if(D>0){
        x1 = (-b+sqrt(D))/(2*a);
        x2 = (-b-sqrt(D))/(2*a);
        printf("Root are real and distinct \n");
        printf(" root 1 = %f\n",x1);
        printf(" root 2 = %f\n",x2);
    }else if (D==0){
        printf("Root are real and equal \n");
        x1 = -b/(2*a); 
        printf("Root = %f",x1);
    } else{
        realPart=-b/(2*a);
        imaginaryPart= sqrt(-D)/(2*a);
        printf("Root are complex \n");
        printf("Root 1 = %f + %fi\n ",realPart,imaginaryPart);
        printf("Root 2 = %f + %fi\n ",realPart,imaginaryPart);

    }

    // x1=(-b+sqrt(b*b-4*a*c))/2*a ;
    // x2=(-b-sqrt(b*b-4*a*c))/2*a ;
    // printf("\nthe solution of quadrqtic equation (%dx^2)+(%dx)+(%d)=0  is x1 =  %f and x2= %f is ",a,b,c, x1, x2);



    return 0 ;
}