#include<stdio.h>
#include<sys/types.h>
#include<unistd.h>
void forkexample()
{
	// child process because return value zero
	if (fork() == 0)
	{
		printf("Hello World from Child!\n");
		printf("Child Process Id is : %d", getpid());
	}
	// parent process because return value non-zero.
	else if (fork() >0 )
	{
		printf("Hi from Parent!\n");
		printf("parent Process ID is %d",getpid())
	}		
}
int main()
{
	forkexample();
	return 0;
}
