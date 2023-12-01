#include <stdio.h>
#include <time.h>

int main() {
    int year, month, day, hour, minute, second;
    scanf("%d %d %d %d %d %d", &year, &month, &day, &hour, &minute, &second);
    time_t x;
    scanf("%llx", &x);
    struct tm inputTime = {0};
    inputTime.tm_year = year - 1900;
    inputTime.tm_mon = month - 1;
    inputTime.tm_mday = day;
    inputTime.tm_hour = hour;
    inputTime.tm_min = minute;
    inputTime.tm_sec = second;
    mktime(&inputTime);
    char* days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    char* mons[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    int dayOfWeek = inputTime.tm_wday;
    printf("%s\n", days[dayOfWeek]);
    printf("%c%c%c %s %2d %02d:%02d:%02d %d\n", 
    days[dayOfWeek][0],
    days[dayOfWeek][1],
    days[dayOfWeek][2],
    mons[inputTime.tm_mon], 
    inputTime.tm_mday, 
    inputTime.tm_hour, 
    inputTime.tm_min, 
    inputTime.tm_sec, 
    inputTime.tm_year + 1900
    );
    char formattedTime[20];
    strftime(formattedTime, sizeof(formattedTime), "%Y-%m-%d %H:%M:%S", &inputTime);
    printf("%s\n", formattedTime);
    struct tm* xTime = localtime(&x);
    int xDayOfWeek = xTime->tm_wday;
    printf("%s\n", days[xDayOfWeek]);
    printf("%c%c%c %s %2d %02d:%02d:%02d %d\n", 
    days[xDayOfWeek][0],
    days[xDayOfWeek][1],
    days[xDayOfWeek][2],
    mons[xTime->tm_mon], 
    xTime->tm_mday, 
    xTime->tm_hour, 
    xTime->tm_min, 
    xTime->tm_sec, 
    xTime->tm_year + 1900
    );
    strftime(formattedTime, sizeof(formattedTime), "%Y-%m-%d %H:%M:%S", xTime);
    printf("%s\n", formattedTime);
}
