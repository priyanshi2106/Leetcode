{
int mid=start+(end-start)/2;
if(letters[mid]==target)
{
start=mid+1;
}
else if(target>letters[mid])
{
start=mid+1;
}
else if(letters[mid]>target)
{
res=letters[mid];
end=mid-1;
}
}
return res;