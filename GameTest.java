int level_type1 = 0 , level_type2 = 0;
	sort(arr1,arr1+5);
	sort(arr2,arr2+5);
	level_type1 = get_level_type(arr1);
	level_type2 = get_level_type(arr2);
	if (level_type1 > level_type2)
	{
		return -1;
	}
	else if(level_type1 < level_type2)
	{
		return 1;
	}
	return  same_level_cmp( arr1,level_type1 ,  arr2, level_type2);
}
int main()
{
	char str[1000];
	char *p = NULL;
	int i = 0;
	int result = 0;
	memset(str,0,1000);
	int array[10] = {0};
	while(gets(str))
	{
		i = 0;
		p = strtok(str," ");
		while (p)
		{
			array[i++] = rank_card(p[0],p[1]);
			p = strtok(NULL," ");
		}
	//	result =get_result(array,array+5);
		if ( ( result=get_result(array,array+5)) < 0 )
		{
			printf("%s\n",black);
		}
		else if(result > 0)
		{
			printf("%s\n",white);
		}
		else
		{
			printf("%s\n",tie);
		}
		memset(str,0,1000);
 
	}
 


