/*
//Hello World
package code.solution;
public class expert {
    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World ");
    }
}
//sorting
package code.solution;
public class expert
{
    static void traversal(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


    //Bubble Sort
    static void bubbleSort(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        traversal(arr);
    }

    //selection sort
    static void selection(int []arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int min = arr[i];
            if(arr[i] < min)
            {
                int temp = arr[i];
                arr[i] = min;
                min = temp;
            }
        }
        System.out.println();
        traversal(arr);
    }
    //merge
//    static void merge(int []arr,int low,int high,int mid)
//    {
//        int
//    }

    //merge Sort
    static void mergeSort(int low,int high)
    {
        if(low < high)
        {
            int mid = (low+high)/2;
            mergeSort(low,mid);
            mergeSort(mid+1,high);
        }
    }

    static void insertionSort(int arr[])
    {
        int key = 0;
        for(int i=1;i<arr.length;i++)
        {
            key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]> key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j] = key;
        }
        traversal(arr);

    }

    public static void main(String[] args)
    {
        int []arr = {1,4,8,8,2,3,0,-5};
//        mergeSort(0,arr.length-1);
        insertionSort(arr);
    }
}
//LeetCode-
package code.solution;
public class expert
{
    static void deCode(String str)
    {
        char []arr = str.toCharArray();
        for(int i=arr.length-1;i>=0;)
        {
            if(arr[i] == '#')
            {
                int n = arr[i-1] + arr[i-2] + 9;
                System.out.println((char)n);
                i = i-3;
            }
            else {
                int n = arr[i] + 48;
                System.out.println((char)n);
                i--;
            }
        }
    }
    public static void main(String[] args)
    {
        String str = "10#2310#";       //jcbj
        deCode(str);
    }
}
//LeetCode-242
package com.practiceCode;
public class expert
{
    static boolean isAnagram(String s,String t)
    {
        char []sch = s.toCharArray();
        char []tch = t.toCharArray();
        boolean []bool = new boolean[s.length()];
        boolean check = false;

        if(s.length() == t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                for(int j=0;j<t.length();j++)
                {
                    if(sch[i] == tch[j] && bool[j] == false)
                    {
                        bool[j] = true;
                    }
                }
            }
        }
        else {
            return false;
        }

        for(int i=0;i<bool.length;i++)
        {
            if(bool[i] == false)
            {
                check = false;
                break;
            }
            else {
                check = true;
            }
        }
        return check;
    }
    public static void main(String []args)
    {
        String s = "aacc";
        String t = "ccac";
        System.out.println(isAnagram(s,t));

    }
}
//LeetCode - 389
package code.solution;
public class expert
{
    static void traversal(String s)
    {
        char []ch = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            System.out.print(ch[i]+" ");
        }
    }
    static char findTheDifference(String s,String t)
    {
        char diff = ' ';
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        boolean []check = new boolean[t.length()];

        for(int i=0;i< tch.length;i++)
        {
            for(int j=0;j< sch.length;j++)
            {
                if(tch[i] == sch[j] && check[i] == false)
                {
                    check[i] = true;
                }
            }
        }


        for(int i=0;i<check.length;i++)
        {
            if(check[i] == false)
            {
                diff = tch[i];
            }
        }
        return diff;
    }
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}

//LeetCode - 58
package code.solution;
public class expert
{
    static void lastLength(String s)
    {
        String str = s.trim();
        char []ch = str.toCharArray();
        int count= 0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(ch[i] == ' ')
            {
                break;
            }
            else
            {
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args)
    {
        String s = "Hello World      the moon               ";
        lastLength(s);
    }
}
//LeetCode - 125
package code.solution;
import java.util.Locale;
public class expert
{
    static boolean isPalindrome(String s)
    {
        String str = "";
        char []arr = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(arr[i] >=65 && arr[i] <= 90 || arr[i] >= 97 && arr[i] <= 122)
            {
                str = str+arr[i];
            }
        }
        String strr = str.toLowerCase();

        int low = 0;
        int high = strr.length()-1;
        char[] ch = strr.toCharArray();
        boolean flag = false;

        while(low<high)
        {
            if((int)ch[low] == (int)ch[high])
            {
                flag = true;
            }
            else {
                flag = false;
                System.out.println(ch[low]);
                break;
            }
            low++;
            high--;
        }
        return flag;
    }

    public static void main(String[] args)
    {
        String s = "A man, a plan, // a canal: panama";
        System.out.println(isPalindrome(s));
    }
}
//LeetCode - 344
package code.solution;
public class expert
{
    static void reverseStr(String[] s)
    {
        int low=0;
        int high=s.length-1;
        while(low<high)
        {
            String temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }

        for(int i=0;i<s.length;i++)
        {
            System.out.print(s[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        String []s = {"h","e","l","l","o"};
        reverseStr(s);
    }
}
//LeetCode-383
package code.solution;
public class expert
{
    static void isRanSom(String ransomNote,String magazine)
    {
        boolean flag = false;
        if(magazine.length()>=ransomNote.length())
        {
            if(magazine.contains(ransomNote))
            {
                flag = true;
            }
        }
        System.out.println(flag);
    }
    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "baa";
        isRanSom(ransomNote,magazine);

    }
}

//Leetcode-434
package code.solution;
public class expert
{
    public static void main(String[] args)
    {
        String s = "Hello, my name is mdshoaib akhtar";
        String []str = s.split(" ");
        System.out.println(str.length);
    }
}
//412
package code.solution;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    static List<String> fizzBuzz(int n)
    {
        List<String> str = new ArrayList<>(n);
        for(int i=1;i<=n;i++)
        {
            if(i % 3 == 0 && i % 5 == 0)
            {
                str.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                str.add("Fizz");
            }
            else if(i%5==0)
            {
                str.add("Buzz");
            }
            else
            {
                char ch = (char)i;
                String st = "";
                st = st+(int)ch;
                str.add(st);
            }
        }
        return str;
    }
    public static void main(String[] args)
    {
        int n=15;
        System.out.println(fizzBuzz(n));
    }
}
//345
package code.solution;
public class expert
{
    static void vowelsRev(String s)
    {
        String str = "";
        char[] ch = s.toCharArray();
        int low=0;int high=s.length()-1;
        int i=0;int j=s.length()-1;
        char a = ' ';boolean aa=false;
        char b = ' ';boolean bb = false;

        while(low<high)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                System.out.println(ch[i]);
                a = ch[i];
                aa = true;
            }
            if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
            {
                System.out.println(ch[j]);
                b = ch[j];
                bb=true;
            }
            if(aa==true && bb==true)
            {
                char trmp = a;
                a = b;
                b = trmp;

                System.out.println(a);
                System.out.println(b);
                aa=false;
                bb=false;
            }
            low++;high--;
            i++;j--;
        }

        for(int k=0;k<s.length();k++)
        {
            str = str+ch[k];
        }
        System.out.println(str);

    }
    public static void main(String []args)
    {
        String s = "hello";            //holle
        vowelsRev(s);
    }
}
//392
package code.solution;
public class expert
{
    static void isSubsequence(String s,String t)
    {
        char[] sch = s.toCharArray();
        char[] tch = t.toCharArray();
        boolean[] lock = new boolean[s.length()];
        boolean flag = true;
        int j=0;
        if(s.length() <= t.length())
        {
            for(int i=0;i<s.length();i++)
            {
                for(;j<t.length();j++)
                {
                    if(sch[i]==tch[j] && lock[i]==false)
                    {
                        lock[i] = true;
                        break;
                    }
                }
            }
        }

        for(int i=0;i< lock.length;i++)
        {
            if(lock[i]==false)
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main(String []args)
    {
        String s="ace";
        String t="aec";
        isSubsequence(s,t);
    }
}

//387
package code.solution;
public class expert
{
    static void nonRepeating(String str)
    {
        char[] arr=str.toCharArray();
        int index=-1;boolean lock = false;//leetcode
        boolean[] check = new boolean[str.length()];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i != j && arr[i] == arr[j] && check[i]==false)
                {
                   check[i] = true;
                }
            }
        }

        for(int i=0;i<check.length;i++)
        {
            if(check[i] == false && lock == false)
            {
                index = i;
                lock = true;
                break;
            }
        }
        System.out.println(index);

    }
    public static void main(String[] args) {
        String str = "leelttccoodee";
        nonRepeating(str);
    }
}
//LeetCode -20
package code.solution;
public class expert
{
   static void validParenthesis(String s)
   {
       char []ch = s.toCharArray();
       boolean isvalid = false;
       for(int i=1;i<s.length();i=i+2)
       {
           if((ch[i-1] == '(' && ch[i] == ')') || (ch[i-1] == '[' && ch[i] == ']') || (ch[i-1]== '{' &&
                   ch[i] == '}'))
           {
               isvalid = true;
           }
           else {
               isvalid = false;
               break;
           }
       }
       System.out.println(isvalid);
   }

   static void isVlaidParent(String s)
   {
       char []ch = s.toCharArray();
       int bracket = 0;
       boolean isValid = false;
       for(int i=0;i<s.length();i++)
       {
           if(ch[i]=='(' || ch[i]=='{' || ch[i]=='[')
           {
               bracket++;
           }
           else {
               bracket--;
           }
       }
       System.out.println(bracket);
       if(bracket == 0)
       {
           isValid = true;
       }else {
           isValid = false;
       }

       System.out.println(isValid);


   }
    public static void main(String[] args)
    {
        String s = "((())[()][]";
        isVlaidParent(s);
    }
}
package code.solution;
public class expert
{
    //method for traversal
    static void traversal(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    //method for find the sum of two matrix
    static void matrixSum(int [][]arr,int [][]brr)
    {
        int [][]crr = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                crr[i][j] = arr[i][j]+brr[i][j];
            }
        }
        traversal(crr);
    }

    //method for sorting the 2D array
    static void sortingTwoDArr(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i][j-1] > arr[i][j])
                {
                    //swap
                    int temp = arr[i][j-1];
                    arr[i][j-1] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }
        traversal(arr);
    }


    public static void main(String []args)
    {
     int [][]arr = {{5, 6, 7},
                    {9, 1, 2},
                    {8, 3, 4}};
     int [][]brr = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};
     traversal(arr);
     traversal(brr);
     matrixSum(arr,brr);
        sortingTwoDArr(arr);

    }
}
//med-1314;
package code.solution;
public class expert
{

    static void traversal(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }


    //method for traversal
    static void matricBlockSum(int [][]arr,int k)
    {
        int [][]newArr = new int[arr.length][arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int r_low = i-k;int r_high = i+k;
            for(int j =0;j<arr.length;j++)
            {
                int c_low = j-k;int c_high = j+k;
               newArr[i][j]=sumOfBlock(arr,r_low,r_high,c_low,c_high);
            }
        }
        traversal(newArr);
    }

    static int sumOfBlock(int [][]arr,int r_low,int r_high,int c_low,int c_high)
    {
        if(r_low<0)
            r_low = 0;
        if(r_high>=arr.length)
            r_high = arr.length-1;
        if(c_low<0)
            c_low = 0;
        if(c_high>=arr.length)
            c_high = arr.length-1;

       int sum = 0;
        for(int i=r_low;i<=r_high;i++)
        {
            for(int j =c_low;j<=c_high;j++)
            {
                sum += arr[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args)
    {
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int k = 2;
        traversal(arr);
        matricBlockSum(arr,k);

    }
}

package code.solution;
public class expert
{
    static void traversal(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j =0;j<arr.length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    static void sortingTwoDArr(int [][]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[i][j-1] > arr[i][j])
                {
                    //swap
                    int temp = arr[i][j-1];
                    arr[i][j-1] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }
        traversal(arr);
    }
    public static void main(String[] args)
    {
        int [][]arr = {{9,5,1},{2,7,3},{6,8,4}};
        System.out.println("Before Sorting");
        traversal(arr);
        System.out.println("After Sorting");
        sortingTwoDArr(arr);
    }
}

//1984
package code.solution;

import java.util.Arrays;

public class expert
{
    static void minDifference(int []nums,int k)
    {
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        if(k<=1 || nums.length<=1)
        {
            diff = 0;
        }else
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i]-nums[i-1]<=diff)
                {
                    diff = nums[i]-nums[i-1];
                }
            }
        System.out.println(diff);
    }
    public static void main(String args[])
    {
        int []nums = {1};int k = 1;
        minDifference(nums,k);
    }
}
//350
package code.solution;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    static void intersectionArr(int []nums1,int []nums2)
    {
        List arr = new ArrayList();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    arr.add(nums2[j]);
                    break;
                }
            }
        }
        System.out.println(arr);
    }
    public static void main(String[] args)
    {
      int []nums1 = {1,2,2,1,3,4};int []nums2 = {4,2,3,2};
        intersectionArr(nums1,nums2);
    }
}/*
//268
package code.solution;
import java.util.Arrays;
public class expert
{
    static void findMissing(int []nums)
    {
        Arrays.sort(nums);
        int missing = 0;
        int min = nums[0];int max= nums[nums.length-1];
        for(int i=1;i< nums.length;i++)
        {
            if(nums[i]-nums[i-1]!=1)
            {
                missing = i;
            }
        }
        System.out.println(missing);
    }
    public static void main(String[] args)
    {
        int nums[] = {9,8,7,6,5,3,2,1,0};
        findMissing(nums);

    }
}
//509
package code.solution;
public class expert
{
    static int fibonacciSeries(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if (n==1)
            return 1;
        else
            return fibonacciSeries(n-1)+fibonacciSeries(n-2);
    }
    public static void main(String[] args)
    {
        int n = 3;
        System.out.println(fibonacciSeries(n));
    }
}
//Sorting
1.Bubble Sort
2.Selection Sort
3.Insertion Sort
4.Quick Sort
5.Merge Sort
6.Heap Sort

package code.solution;
public class sorting
{
    void traversal(int []arr)
    {
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    void bubbleSort(int []arr)
    {
        System.out.println("Bubble Sort");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    //Calling Swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        traversal(arr);
    }
    void selectionSort(int []arr)
    {
        System.out.println("Selection Sort");
        int min = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    //swapping
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
        }
        traversal(arr);
    }
    void insertionSort(int []arr)                   //4, 5, 6, 7, 1, 3, 0
    {
        System.out.println("Insertion Sort");
        for(int i=1;i<arr.length;i++)
        {
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] >key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        traversal(arr);

    }

}

public class expert
{
    public static void main(String []args)
    {
        int []arr = {4,5,6,7,1,3,0};
        sorting sort = new sorting();
        sort.traversal(arr);
        sort.bubbleSort(arr);
        sort.selectionSort(arr);
        sort.insertionSort(arr);
    }
}


//2161
package code.solution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class expert
{
    static void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
   static void partitionOfArray(int nums[],int pivot)
   {
       List less = new ArrayList();
       List great = new ArrayList();
       List same = new ArrayList();
       for(int i=0;i<nums.length;i++)
       {
           if(nums[i]<pivot)
           {
               less.add(nums[i]);
           }
           if(nums[i] == pivot)
           {
               same.add(nums[i]);
           }
           if(nums[i]>pivot)
               great.add(nums[i]);
       }
       List<Integer> mainList = new ArrayList();
       mainList.addAll(less);
       mainList.addAll(same);
       mainList.addAll(great);

       int []a = mainList.stream().mapToInt(i -> i).toArray();
   }
    public static void main(String []args)
    {
        int []nums = {9,12,5,10,14,3};//9,5,3,10,12,14
        int pivot = 10;
        partitionOfArray(nums,pivot);
    }
}
package code.solution;
public class expert
{
    static void traversal(int []arr)
    {
            for(int j=0;j<arr.length;j++)
            {
                System.out.print(arr[j]+"  ");
            }
            System.out.println();
    }
    static int partitionIndex(int []arr,int low,int high)
    {
        int pivot = arr[low];
        int i=low+1;
        int j=high;
        int temp = 0;
        while(i<j)
        {
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    static void quickSort(int []arr,int low,int high)
    {
        int ind = 0;
        if(low<high)
        {
        ind = partitionIndex(arr,low,high);
        quickSort(arr,low,ind-1);
        quickSort(arr,ind+1,high);
        }
    }
    public static void main(String[] args)
    {
        int []arr = {4,7,5,1,0,3,8,2,9};
        traversal(arr);
        quickSort(arr,0,arr.length-1);
        traversal(arr);
    }
}
//1329
package code.solution;
import java.util.Arrays;
public class expert
{
    static void traversal(int [][]arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void transPose(int [][]arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        int [][]transpose = new int[col][row];
        for(int i = 0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                transpose[j][i] = arr[i][j];
            }
        }


        int temp ;int p=transpose.length;
        while(p>0)
        {
            for(int i=0;i<col;i++)
            {
                for(int j=1;j<row;j++)
                {
                    if(transpose[i][j-1] > transpose[i][j])
                    {
                        temp = transpose[i][j-1];
                        transpose[i][j-1] = transpose[i][j];
                        transpose[i][j] = temp;
                    }
                }
            }
            p--;
        }
        traversal(transpose);

    }

    static void sortMatrix(int [][]arr)
    {
        int temp ;
        int p=arr[0].length;
        int row = arr.length;
        int col = arr[0].length;
        while(p>0)
        {
            for(int i=0;i<row;i++)
            {
                for(int j=1;j<col;j++)
                {
                    if(arr[i][j-1] > arr[i][j])
                    {
                        temp = arr[i][j-1];
                        arr[i][j-1] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }
            }
            p--;
        }
        transPose(arr);
    }
    public static void main(String []args)
    {
        int [][]arr = {{9,7,8},{5,1,4},{3,0,2},{0,0,0}};
        traversal(arr);
//        sortMatrix(arr);
    }
}
//merge Sort
package com.practiceCode;
public class expert
{
    static void traversal(int []arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    static void merge(int []arr, int mid, int low, int high)
    {
        int []B = new int[arr.length]; int k = low;
        int i, j;
        i = low;
        j = mid + 1;

        while (i <= mid && j <= high)
        {
            if (arr[i] < arr[j])
            {
                B[k] = arr[i];
                i++;
                k++;
            }
            else
            {
                B[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid)
        {
            B[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high)
        {
            B[k] = arr[j];
            k++;
            j++;
        }
        for (int p = low; p <= high; p++)
        {
            arr[p] = B[p];
        }
    }


    static void mergeSort(int[] arr, int low, int high)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,mid,low,high);
        }
    }
    public static void main(String []args)
    {
        int []arr = {5,6,1,0,9,2,7,3};
        traversal(arr);
        mergeSort(arr,0,arr.length-1);
        traversal(arr);

    }
}
//347
package code.solution;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class expert
{
    //just for traversal
    static void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }



    //driver method which runs the code
    static void freqElem(int []arr,int k)
    {
//        int []freq = new int[arr.length/2];
        List freq = new ArrayList();
        int count;Arrays.sort(arr);int p=0;          //1,1,2,2

       for(int i=0;i<arr.length;i++)
       {
           count=0;
           for(int j=i;j<arr.length;j++)
           {
               if(arr[i]==arr[j])
               {
                   count++;
               }
           }
           if(count >= k)
           {
               freq.add(arr[i]);p++;
           }
       }
        int []a = freq.stream().mapToInt(i -> (int) i).toArray();
        traversal(a);
    }

    public static void main(String []args)
    {
        int []arr = {2,5,4,5,4,1,0,6,9,8,9,8,2};
        int k = 2;
        traversal(arr);
        freqElem(arr,k);
    }
}

//215
package com.practiceCode;
import java.util.Arrays;
public class expert
{
    static void KthLargestElem(int []nums,int k)
    {
        Arrays.sort(nums);
        int elem = nums[nums.length-k];
        System.out.println(elem);
    }
    public static void main(String []args)
    {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        KthLargestElem(nums,k);
    }
}
//238
package code.solution;
public class expert
{
    static void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    static void proOFArr(int []nums)
    {
        int []product = new int[nums.length];int pro;
        for(int i=0;i<nums.length;i++)
        {
            pro = 1;
            for(int j=0;j<nums.length;j++)
            {
                if(i != j)
                {
                    pro = pro * nums[j];
                }
            }
            product[i] = pro;
        }
        traversal(product);
    }
    public static void main(String[] args)
    {
        int []nums = {-1,1,0,-3,3};
        traversal(nums);
        proOFArr(nums);
    }
}
//1351
package code.solution;
public class expert
{
    static void countNegative(int [][]mat)
    {
        int neg = 0;int i=0;int j;
        int row = mat.length;int col = mat[0].length;
        while(i<row)
        {
            j=0;
            while(j<col)
            {
                if(mat[i][j]<0)
                    neg++;
                j++;
            }
            i++;
        }
        System.out.println(neg);
    }
    public static void main(String[] args)
    {
        int [][]mat = {{4,5,7,8},{-8,7,9,4},{8,-10,7,-8},{4,5,8,-3}};
        countNegative(mat);
    }
}
//2125
package code.solution;
public class expert
{
    static void traversal(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void shift(int []arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==0)
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    static int oneFind(String bank)
    {
        int one = 0;
        char[] ch = bank.toCharArray();
        for(int i=0;i<bank.length();i++)
        {
            if(ch[i]=='1')
            {
                one++;
            }
        }
        return one;
    }

    static void laserBeam(String[] bank)
    {
        int laser = 0;int[] maintain=new int[bank.length];
        for(int i=0;i<bank.length;i++)
        {
            maintain[i] = oneFind(bank[i]);
        }
        shift(maintain);
        for(int i=1;i< maintain.length;i++)
        {
           laser += (maintain[i-1]*maintain[i]);
        }
        System.out.println(laser);
    }
    public static void main(String []args)
    {
        String[] bank = {"0","1","1","1"};
        laserBeam(bank);
    }
}

//1337
package code.solution;
public class expert
{
    static void traversal(int [][]arr)
    {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void traversal(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void weakestCountry(int [][]mat,int k)
    {
        int row = mat.length;int col = mat[0].length;
        int []outPut = new int[k];int one;int pk=0;
        int []soldier = new int[row];
        for(int i=0;i<row;i++)
        {
            one=0;
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]==1)
                {
                    one++;
                }
                soldier[i]=one;
            }
        }
        traversal(soldier);
    }


    static void incrementOrder(int []sold)
    {
        int []outPut = new int[3];int i=0;int j=0;int s=0;
        while(i< sold.length)
        {
            while(j< sold.length)
            {
                if()
                {

                }
            }
        }
    }

    public static void main(String[] args)
    {
       int [][]mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
       traversal(mat);int k=3;weakestCountry(mat,k);
       int []sold = {2, 4, 1, 2, 5};

    }
}
//kadane's Algorithm  53
package code.solution;
public class expert
{
    static void maxSub(int []nums)
    {
        int maxSum = 0;int currSum = 0;
        for(int i=0;i<nums.length;i++)       //-2,1,-3,4,-1,2,1,-5,4
        {
            currSum = currSum + nums[i];
            if(maxSum < currSum)
            {
                maxSum = currSum;
            }
            if(currSum<0)
            {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args)
    {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSub(nums);

    }
}
//8
package code.solution;
public class expert
{
    static void stringToInt(String s)
    {
        double num = 0;int dig = s.length()-1;
        double ten = Math.pow(10,dig);
        double ans = 0;int i = 0;int j=s.length();
        if(s.charAt(0)=='-')
        {
            i = 1;
            ten /= 10;
        }
        while(i<j)
        {
            num = (int)s.charAt(i)-48;
            num = num * ten;//10
            ans =ans + num;
            ten /= 10;
            i++;
        }
    }
    public static void main(String[] args)
    {
        String s = "-10009";
        stringToInt(s);

    }
}
//Reverse number 7
//29 - Divide Two Integers
package code.solution;
class sorting
{
    void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    //Bubble Sort
    void bubbleSort(int []arr)        //5,4,2,1
    {
        System.out.println("Unsorted Array");
        traversal(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j] < arr[j-1])
                {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        traversal(arr);
    }

    //selection Sort
    void selectionSort(int []arr)
    {
        int min= 0;
        for(int i=0;i<arr.length-1;i++)
        {
            min = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }
            }
        }
        System.out.println("Sorted Array");
        traversal(arr);
    }

    //Insertion Sort
    void insertionSort(int []arr)
    {
        int key = 0;
        for(int i=1;i<arr.length;i++)//5,6,7,1,2,4,0
        {
            key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]> key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j] = key;
        }
    }


    //Quick Sort
    int partition(int []arr,int low,int high)
    {
        int i = 0;int j = arr.length-1;int pivot = arr[0];
        while(i<j)
        {
            while(arr[i]<=pivot) i++;
            while(arr[j]>=pivot) j--;

            if(i<j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        if(i<j)
        {
            int temp = pivot;
            pivot = arr[j];
            arr[j] = temp;
        }
        return j;
    }


    void quickSort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int index = partition(arr,low,high);
            quickSort(arr,low,index);
            quickSort(arr,index+1,high);
        }
    }
}
public class expert
{
    public static void main(String []args)
    {
        int []arr = {1,9,7,2,4,7,3,-8,0,-9};
        sorting sort = new sorting();
//        sort.bubbleSort(arr);
//        sort.selectionSort(arr);
        sort.quickSort(arr,0,arr.length-1);
    }
}
//1351
package code.solution;
public class expert
{
    static void countNegative(int [][]mat)
    {
        int neg = 0;int i=0;int j;
        int row = mat.length;int col = mat[0].length;
        while(i<row)
        {
            j=0;
            while(j<col)
            {
                if(mat[i][j]<0)
                    neg++;
                j++;
            }
            i++;
        }
        System.out.println(neg);
    }
    public static void main(String[] args)
    {
        int [][]mat = {{4,5,7,8},{-8,7,9,4},{8,-10,7,-8},{4,5,8,-3}};
        countNegative(mat);
    }
}
package code.solution;
public class expert
{
    static void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    //Quick Sort
    static int partition(int []arr,int low,int high) //4,2,5,3,1,0,-5
    {
        int i = low+1;
        int j = high;
        int pivot = arr[low];
        int temp = 0;
        while(i<j)
        {
            while(arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;

            if(i<j)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }


    static void quickSort(int []arr,int low,int high)
    {
        if(low<high)
        {
            int index = partition(arr,low,high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {4,2,5,3,1,0,-5};
        traversal(arr);
        quickSort(arr,0,arr.length-1);
        traversal(arr);

    }
}

package code.solution;
public class expert
{
    static void traversal(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    static void merge(int []arr,int low,int mid,int high,int len)
    {
        int []b = new int[len];
        int i,j,k;
        i=low;
        j=mid+1;
        k=low;

        while(i<=mid && j<=high)
        {
            if(arr[i]<arr[j])
            {
                b[k] = arr[i];
                i++;k++;
            }
            else
            {
                b[k] = arr[j];
                j++;k++;
            }
        }
        while(i<=mid)
        {
            b[k] = arr[i];
            i++;k++;
        }
        while(j<=high)
        {
            b[k] = arr[j];
            j++;k++;
        }
        for(int p = low;p<=high;p++)
        {
            arr[p] = b[p];
        }
    }
    static void mergeSort(int []arr,int low,int high,int len)
    {
        if(low<high)
        {
            int mid = (low+high)/2;
            mergeSort(arr,low,mid-1,len);
            mergeSort(arr,mid+1,high,len);
            merge(arr,low,mid,high,len);
        }
    }
    public static void main(String []args)
    {
        int []arr = {2,1,8,4,0};
        int len = arr.length;
        traversal(arr);
        mergeSort(arr,0,arr.length-1,len);
        traversal(arr);
    }
}
//451 - sort the string
package code.solution;
public class expert
{
    static void traversal(int [][]a)
    {
        int row= a.length;
        int col = a[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j] + "  ");
            }
        System.out.println();
        }
    }
    static void row_matrixSort(int [][]a)
    {
        int row= a.length;
        int col = a[0].length;
        for(int p =0;p<row;p++){
            for(int i=0;i<row;i++){
                for(int j=0;j<col-1;j++){
                    if(a[i][j]>a[i][j+1]){
                        int temp = a[i][j];
                        a[i][j]  = a[i][j+1];
                        a[i][j+1] = temp;
                    }
                }
            }
        }
    }
    public static void main(String []args)
    {
        int [][]a = {{9,7,8},{5,1,4},{3,0,2},{0,0,0}};
        System.out.println("Unsorted matrix");
        traversal(a);
        System.out.println("Sorted Matrix");
        row_matrixSort(a);
    }
}
//287
package code.solution;
public class expert
{
    static void repeatedElem(int []nums)
    {
        int []a = new int[nums.length];
        int elem = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(a[nums[i]]==0)
            {
                a[i] = 1;
            }
            else {
                elem = nums[i];
                break;
            }
        }
        System.out.println(elem);
    }
    public static void main(String[] args)
    {
        int nums[] = {1,2,3,4,1};
        repeatedElem(nums);
    }
}

//442
//Input: nums = [1,1,2]
//        Output: [1]

//Input: nums = [1]
//        Output: []
//return in list
//find the elem which repeats atleast twice in the list
package code.solution;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    static void twiceRepeat(int []nums)
    {
        int []a = new int[nums.length+1];
        List repeat = new ArrayList();   //
        int elem = 0;                    //0,0,0,0,0,0,0,0
        for(int i=0;i<nums.length;i++)   //4,3,2,7,7,2,3,1
        {
            if(a[nums[i]]==0)
            {
                a[nums[i]]= 1;
            }
            else
            {
                repeat.add(nums[i]);
            }
        }
        System.out.println(repeat);
    }
    public static void main(String[] args)
    {
         int []nums = {4,3,2,7,8,2,3,4};       //Output: [2,3]
        twiceRepeat(nums);
    }
}

//2133 valid matrix
package code.solution;
public class expert
{
    static void traversal(int [][]arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void isValidmatrix(int [][]matrix)
    {
        boolean [][]bool = new boolean[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
                for(int k=1;k<matrix.length+1;k++)
                {
                    if(matrix[i][j]==k && !bool[i][j] ){
//                      i---->  {2, 1, 4, 3}
//                        {1, 2, 3, 4}
//                        {4, 5, 3, 1}
//                        {2, 1, 4, 3}
                        bool[i][j] = true;
                    }
                }
            }
        }

        boolean flag = true;

        for(int i =0;i<bool.length;i++)
        {
            for(int j=0;j<bool[0].length;j++)
            {
//                System.out.print(bool[i][j]+"  ");
                if(bool[i][j]==false && flag == true)
                {
                    flag = false;
//                    System.out.println(matrix[i][j]);
                    break;
                }
            }
//            System.out.println();
        }
        System.out.println(flag);
    }

    public static void main(String[] args)
    {
        int [][]matrix ={{2,1,4,3},
                         {1,2,3,4},
                         {4,5,3,1},
                         {2,1,4,3}};
        isValidmatrix(matrix);
    }
}



//1832
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.
package code.solution;
public class expert
{
    public static void isPanagram(String s)
    {
        boolean []boo = new boolean[150];
        for(int i=0;i<s.length();i++)
        {
            for(int j=97;j<123;j++)
            {
                if((int)s.charAt(i) == j)
                {
                    boo[j] = true;
                }
            }
        }

        boolean flag = true;
        for(int i =97;i<123;i++)
        {
            if(boo[i]==false && flag == true)
            {
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }
    public static void main(String[] args)
    {
        String s = "abcxyz";
        isPanagram(s);
    }
}

package com.practiceCode;
public class expert
{
    public static void main(String[] args)
    {
        String patterns[] = {"a","b","c"};
        String word = "aaaaabbbbb";
        System.out.println(word.contains(patterns[0]));
        System.out.println(word.contains(patterns[1]));
        System.out.println(word.contains(patterns[2]));
    }
}

package com.practiceCode;
public class expert
{
    static void reverse(String s)
    {
        char temp;
        int low = 0;
        int high = s.length()-1;
        char []c = s.toCharArray();
        while(low < high)
        {
            temp = c[low];
            c[low] = c[high];
            c[high] = temp;
            low++;high--;
        }
        String p = new String(c);
        System.out.println(p);
    }

    static String reverse(char []c,int low,int high)
    {
        char temp;

        if(low < high)
        {
            temp = c[low];
            c[low] = c[high];
            c[high] = temp;

            reverse(c,low+1,high-1);
        }
        String p = new String(c);
        return p;
    }

    static void traversal(int []a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");
    }
    static int[] reverse(int []a,int low,int high)
    {
        int temp;

        if(low < high)
        {
            temp = a[low];
            a[low] = a[high];
            a[high] = temp;

            reverse(a,low+1,high-1);
        }
        return a;
    }

    public static void main(String[] args)
    {
//      String s = "hello";
//      char []c = s.toCharArray();
//      System.out.println(reverse(c,0,s.length()-1));

        int []arr = {1,2,3,4};
        traversal(arr);
        reverse(arr,0,arr.length-1);
        System.out.println();
        traversal(arr);
    }
}

               ----------------------------"Ramazan Mubarak"----------------------------
package com.practiceCode;
import java.util.Scanner;
public class expert
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Ramazan Mubarak "+name);
    }
}

//printing all the subsequence
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
class solution
{
    void subseQuence(List list,List input,int index)
    {
        if(index == input.size())
        {
            System.out.println(list);
            return;
        }
        list.add(input.get(index));
        subseQuence(list,input,index+1);
        list.remove(input.get(index));
        subseQuence(list,input,index+1);
    }
}
public class expert
{
    public static void main(String[] args)
    {
        List input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(3);
        List list = new ArrayList();
        solution sol = new solution();
        sol.subseQuence(list,input,0);
    }
}
//2108
package com.practiceCode;
public class expert
{
    static boolean isPalindrome(String s,int i,int low,int high)
    {
        if(i == s.length()-1)
        {
            return true;
        }
        else if(s.charAt(low) != s.charAt(high))
        {
            return false;
        }
        return isPalindrome(s,i+1,low+1,high-1);
    }

    static String isPalindrome(String []str)
    {
        String s = "Sory";
        for(int i=0;i<str.length;i++)
        {
            if(isPalindrome(str[i],0,0,str[i].length()-1) == true)
            {
                s = str[i];
                break;
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        String []str = {"ada","pao","rcar"};
        System.out.println(isPalindrome(str));
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
class solution
{
    boolean flag = false;
    int subseQuence(List list,List input,int index,int sum,int s)
    {
        if(index == input.size())
        {
            if(s == sum)
            {
                System.out.println(list);
                return 1;
            }
            else
                return 0;
        }
        list.add(input.get(index));
        s += (int)input.get(index);
        int l=subseQuence(list,input,index+1,sum,s);
        list.remove(input.get(index));
        s -= (int)input.get(index);
        int r=subseQuence(list,input,index+1,sum,s);
        return l+r;
    }
}
public class expert
{
    public static void main(String[] args)
    {
        List input = new ArrayList();
        input.add(1);
        input.add(2);
        input.add(7);
        input.add(5);
        input.add(4);
        int sum = 8;
        int s = 0;
        List list = new ArrayList();
        solution sol = new solution();
//        sol.subseQuence(list,input,0,sum,0);
        System.out.println(sol.subseQuence(list,input,0,sum,0));
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    static void print(int n)
    {
        if(n == 0)
            return;
        System.out.println(n);
        print(n-1);
    }

    static void print(int []a,int n)
    {
        if(n == -1)
            return;
        else
        print(a,n-1);
        System.out.println(a[n]);
    }

    static void print(String s,int high)
    {
        if(high == -1)
            return;
        else
            print(s,high-1);
        System.out.println(s.charAt(high));
    }

    static List arrToList(int []a,int high,List list)
    {
        if(high == -1)
        {
            return list;
        }
        else
            arrToList(a,high-1,list);
        list.add(a[high]);
        return list;
    }

    static List<Integer> insert(int []a,int elem,int ind,int high,List list)
    {
        if(high == ind)
        {
            list.add(a[high]);
            list.add(elem);
        }
        else if(high == -1){
            System.out.println(list);
            return list;
        }
        else
        list.add(a[high]);
        insert(a,elem,ind,high-1,list);
        return list;
    }




    public static void main(String[] args)
    {
//        int n=8;
//        print(n);

//        int []a = {1,2,3,4,5,6};
//        print(a,a.length-1);

//        String s = "Hello";
//        print(s,s.length()-1);

//        int []a = {5,3,4,1,2};
//        List list = new ArrayList();
//        int elem = 4;int ind = 3;
//        insert(a,elem,ind,a.length-1,list);

//        int []a = {53,3,4,1,2};
//        List list = new ArrayList();
//        System.out.println(arrToList(a,a.length-1,list));

          int []a = {3,4,1,2};
          List list = new ArrayList();


    }
}

package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    //printing the power set of an int array
    static void powerSet(int []a, int low, List<Integer> ds)
    {
        if(low == a.length)
        {
            System.out.println(ds);
            return;
        }
        ds.add(a[low]);
        powerSet(a,low+1,ds);
        ds.remove(ds.size()-1);
        powerSet(a,low+1,ds);
    }

    //printing the power set of a char array
    static void StringSet(char[] s,int low,List<Character> ds)
    {
        if(low == s.length)
        {
            System.out.println(ds);
            return;
        }

        ds.add(s[low]);
        StringSet(s,low+1,ds);
        ds.remove(ds.size()-1);
        StringSet(s,low+1,ds);
    }


    public static void main(String[] args)
    {
        int []a = {1,2,3,4};
        List<Integer> ds = new ArrayList<>();
        powerSet(a,0,ds);

        char[] c = {'a','b','c'};
        List<Character> cha = new ArrayList<>();
        StringSet(c,0,cha);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
class leetCode
{
    void combiSum(int []a, int target,int ind, List<List<Integer>> ans,List ds)
    {
        if(ind == a.length)
        {
            if(target == 0)
            {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(a[ind] <= target)
        {
            ds.add(a[ind]);
            combiSum(a,target-a[ind],ind,ans,ds);
            ds.remove(ds.size()-1);
        }
        combiSum(a,target,ind+1,ans,ds);
    }

    int combiSum2(int []a, int target,int ind, List<List<Integer>> ans,List ds,int s)
    {
        if(ind == a.length)
        {
            if(target == s)
            {
                ans.add(new ArrayList<>(ds));
                return 1;
            }
            else {
                return 0;
            }
        }

            ds.add(a[ind]);
            s = s+a[ind];
            int l= combiSum2(a,target,ind+1,ans,ds,s);
            ds.remove(ds.size()-1);
            s = s- a[ind];
            int r= combiSum2(a,target,ind+1,ans,ds,s);

            return l+r;
    }

    //medium no 39 - find the combinational sum of an array
    List<List<Integer>> combinationalSum(int []a,int target)
    {
        List<List<Integer>> ans = new ArrayList<>();
//        combiSum(a,target,0,ans,new ArrayList());
        combiSum2(a,target,0,ans,new ArrayList(),0);
        return ans;
    }


}
public class expert
{
    public static void main(String []args)
    {
        leetCode lee = new leetCode();
        int []a = {2,3,5,7};
        int target = 7;
        System.out.println(lee.combinationalSum(a,target));
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
class leetcode{
    void set(int []a,int ind,List<Integer> ans,int sum)
    {
        if(ind == a.length)
        {

            System.out.print(ans+"---->");
            System.out.println(sum);
            return;
        }
        set(a,ind+1,ans,sum);
        ans.add(a[ind]);
        sum = sum + a[ind];

        set(a,ind+1,ans,sum);
        ans.remove(ans.size()-1);
        sum = sum - a[ind];
    }
    void powerSum(int []a)
    {
        List<Integer> ans = new ArrayList<>();
        set(a,0,ans,0);
    }
}
public class expert {
    public static void main(String[] args) {
        int []a = {1,2,2}; //0 2 3 5
        leetcode lee = new leetcode();
        lee.powerSum(a);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    static void uniqueSubset(int []a,int ind,List<Integer> ds,List<List<Integer>> ans)
    {
//        if(ind == a.length)
//        {
//            ans.add(new ArrayList<>(ds));
//            return;
//        }
//        ds.add(a[ind]);
//        uniqueSubset(a,ind+1,ds,ans);
//        ds.remove(ds.size()-1);
//        uniqueSubset(a,ind+1,ds,ans);


        //unique subset
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<a.length;i++)   //
        {
            if(i != ind && a[i] == a[i-1])continue;
            ds.add(a[i]);
            uniqueSubset(a,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
     static List<List<Integer>>  findingUniqueSubset(int []a)
    {
        List<List<Integer>> ans = new ArrayList<>();
        uniqueSubset(a,0,new ArrayList<>(),ans);
        return ans;

    }
    public static void main(String[] args)
    {
        int []a = {1,2,2};
        System.out.println(findingUniqueSubset(a));
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;

public class expert
{
    static void permutation(int []a,int ind,List<List<Integer>> ans)
    {
        if(ind == a.length)
        {
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                ds.add(a[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<a.length;i++)
        {
            swap(i,ind,a);
            permutation(a,ind+1,ans);
            swap(i,ind,a);
        }
    }

    static void swap(int i,int j,int []a)
    {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    static List<List<Integer>> findPermutation(int []a)
    {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(a,0,ans);
        return ans;
    }
    public static void main(String[] args)
    {
        int []a = {1,2,3};
        System.out.println(findPermutation(a));
    }
}
package com.practiceCode;
public class expert
{
    public static void main(String[] args)
    {
        int n = 14;int m=1;int bin=0;
        String s= "";
        //Here we are Finding The Binary Value Of n
        while (n != 0)
        {
             int rem = n % 2;
             bin = bin + (rem*m);
             m = m*10;
             n = n /2;
        }

        System.out.println(bin);
    }
}
//121 Stock Problem
package com.practiceCode;
public class expert
{
    static void stockPrice(int []pr)
    {
        int pro = 0;
        int curr = 0;

        for(int i=0;i<pr.length;i++)
        {
            for(int j=i;j<pr.length;j++)
            {
                if((pr[j]-pr[i]) > curr && (pr[j]-pr[i]) > pro)
                {
                    pro = (pr[j]-pr[i]);
                }else {
                    curr = pr[j]-pr[i];
                }
            }
        }
        System.out.println(pro);

    }

    public static void main(String[] args)
    {
        int []prices = {9,8,8,9,8,7,8,8};
        stockPrice(prices);
    }
}
package com.practiceCode;
public class expert
{
    public static void main(String[] args)
    {
        String s = "one double five three four";
        boolean doub = false;
        boolean triple = false;
        String p ="";
        String []str  = s.split(" ");
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals("one") && !doub && !triple)
            {
                p = p + "1";
            }
            if(str[i].equals("two") && !doub && !triple)
            {
                p = p + "2";
            }
            if(str[i].equals("three") && !doub && !triple)
            {
                p = p + "3";
            }
            if(str[i].equals("four") && !doub && !triple)
            {
                p = p + "4";
            }
            if(str[i].equals("five") && !doub && !triple)
            {
                p = p + "5";
            }
            if(str[i].equals("six") && !doub && !triple)
            {
                p = p + "6";
            }if(str[i].equals("seven") && !doub && !triple)
            {
                p = p + "7";
            }if(str[i].equals("eight")&& !doub && !triple)
            {
                p = p + "8";
            }if(str[i].equals("nine") && !doub && !triple)
            {
                p = p + "9";
            }if(str[i].equals("zero") && !doub && !triple)
            {
                p = p + "0";
            }

            if(str[i].equals("double"))
            {
                doub = true;
                continue;
            } if(str[i].equals("triple"))
            {
                triple = true;
                continue;
            }

            if(str[i].equals("one") && doub)
            {
                p = p + "11";
                doub = false;
            }
            if(str[i].equals("two") && doub)
            {
                p = p + "22";
                doub = false;
            }
            if(str[i].equals("three") && doub)
            {
                p = p + "33";doub = false;
            }
            if(str[i].equals("four") && doub)
            {
                p = p + "44";doub = false;
            }
            if(str[i].equals("five") && doub)
            {
                p = p + "55";doub = false;
            }
            if(str[i].equals("six") && doub)
            {
                p = p + "66";doub = false;
            }if(str[i].equals("seven") && doub)
        {
            p = p + "77";doub = false;
        }if(str[i].equals("eight")&& doub)
        {
            p = p + "88";doub = false;
        }if(str[i].equals("nine") && doub)
        {
            p = p + "99";doub = false;
        }if(str[i].equals("zero") && doub)
        {
            p = p + "00";doub = false;
        }



            if(str[i].equals("one") && triple)
            {
                p = p + "111";
                triple = false;
            }
            if(str[i].equals("two") && triple)
            {
                p = p + "222";
                triple = false;
            }
            if(str[i].equals("three") && triple)
            {
                p = p + "333";triple = false;
            }
            if(str[i].equals("four") && triple)
            {
                p = p + "444";triple = false;
            }
            if(str[i].equals("five") && triple)
            {
                p = p + "555";triple = false;
            }
            if(str[i].equals("six") && triple)
            {
                p = p + "666";triple = false;
            }if(str[i].equals("seven") && triple)
        {
            p = p + "777";triple = false;
        }if(str[i].equals("eight")&& triple)
        {
            p = p + "888";triple = false;
        }if(str[i].equals("nine") && triple)
        {
            p = p + "999";triple = false;
        }if(str[i].equals("zero") && triple)
        {
            p = p + "000";triple = false;
        }
        }

        System.out.println(p);
    }
}

//Best time to buy and sell stock for maximum profit
package com.practiceCode;
public class expert
{
    static void stockExchange(int []p)
    {
        //Brute force
//        int profit = 0;
//        for(int i=0;i<p.length;i++)
//        {
//            for(int j=i+1;j<p.length;j++)
//            {
//                if(p[i]<p[j] && p[j]-p[i]>profit)
//                {
//                    profit = p[j]-p[i];
//                }
//            }
//        }
//        System.out.println(profit);


        //optimal solution
        int minsofar = p[0];
        int profit = 0;
        for(int i=0;i<p.length;i++)
        {
            minsofar = Math.min(minsofar,p[i]);
            int pro = p[i]-minsofar;
            profit = Math.max(profit,pro);
        }
        System.out.println(profit);
    }

    static int recSol(int []a,int ind,int profit)
    {
        if(ind == a.length-1)
        {
            return profit;
        }
        for(int i=ind+1;i<a.length;i++)
        {
            if(a[i] > a[ind] && a[i]-a[ind]>profit)
            {
                profit = a[i]-a[ind];
            }
        }
        return recSol(a,ind+1,profit);
    }
    public static void main(String[] args)
    {
        int []prices = {7,1,5,3,6,4};
//        stockExchange(prices);
        System.out.println(recSol(prices,0,0));
    }
}
package com.practiceCode;
public class expert
{
    static void traversal(int [][]arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    static int[][] transPose(int [][]a)
    {

        int r = a.length;
        int c = a[0].length;
        for(int i=0;i<r;i++)
            for(int j=i;j<c;j++){ //temp = 2
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        return a;
    }
    static void rotation(int [][]a)   //temp = 4
    {
        transPose(a);
        int row = a.length;
        int col = a[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<(col/2);j++)
            {
                int temp = a[i][j];
                a[i][j] = a[i][col-1-j];
                a[i][col-1-j] = temp;
            }
        }
        traversal(a);
    }
    public static void main(String[] args)
    {
        int [][]a = {{1,2,3},{4,5,6},{7,8,9}};
//        int [][]a = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int [][]a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
//        int [][]a = {{1,2,3,4,5,8},{6,7,8,9,10,6},{11,12,13,14,15,7},{16,17,18,19,20,9},{21,22,23,24,25,3},{3,65,23,24,25,3}};
        traversal(a);
        System.out.println("After Rotation of 90 Degree");
//        transPose(a);
        rotation(a);
    }
}
//merge tow sorted array
//88 merge sorted array
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
public class expert
{
    static void merge(int []nums1,int m,int []nums2,int n)
    {
        int i=m-1;int j=n-1;int k=m+n-1;
        while(i>=0 || j>=0){
            if(i<0){
                nums1[k] = nums2[j];
                k--;j--;
            }
            else if(j<0){
                nums1[k] = nums1[i];
                k--;i--;
            }
            else if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;i--;
            }
            else{
                nums1[k] = nums2[j];
                k--;j--;
            }
        }

        for(int l=0;l<m+n;l++){
            System.out.print(nums1[l]+" ");
        }

    }
    public static void main(String[] args)
    {
        int []a = {1,2,3,0,0,0};
        int []b = {2,5,6};
        int m=3;int n=3;
        merge(a,m,b,n);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;

public class expert
{
    static boolean isPalindrome(String s,int low,int high)
    {
        boolean check = true;
        while(low<=high)
        {
            if(s.charAt(low)!=s.charAt(high))
            {
                return false;
            }
            low++;high--;
        }
        return check;
    }

    static void checkPalindromic(String s,int ind,List<List<String>> ans,List<String> ds)
    {
        if(ind == s.length())
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<s.length();i++)
        {
            if(isPalindrome(s,ind,i))
            {
                ds.add(s.substring(ind,i+1));//here i+1 means i +1 is excluded
                checkPalindromic(s,i+1,ans,ds);
                ds.remove(ds.size()-1);
            }
        }
    }

    static void partitioning(String s)
    {
        List<List<String>> ans = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        checkPalindromic(s,0,ans,ds);
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        String s = "aabb";
        partitioning(s);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;

public class expert
{
    static void recursiveIteration(int []a,int ind)
    {
        if(ind == a.length){
            return;
        }
        System.out.print(a[ind]+"  ");
        recursiveIteration(a,ind+1);
    }
    static int linearSearch(int []a,int elem,int low,int high)
    {
        int ind=-1;
        if(low <= high)
        {
            if(a[low] == elem)
            {
                return low;
            }
            if(a[high] == elem)
            {
                return high;
            }else {
                 ind=linearSearch(a,elem,low+1,high-1);
            }
        }
        return ind;
    }

    static int linearSearch(int []a,int elem,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(a[i] == elem)
            {
                return i;
            }
        }
        return -1;
    }

    static int recbinarySearch(int []a,int elem,int low,int high)
    {
        int mid = (low+high)/2;
        if(low<=high)
        {
            if(a[mid] == elem)
            {
                return mid;
            }
            if(a[mid] >= elem)
            {
                return recbinarySearch(a,elem,low,mid);
            }
            if(a[mid]<elem)
            {
                return recbinarySearch(a,elem,mid+1,high);
            }
        }
        return -1;
    }

    static void recursiveIteration(int [][]a,int row,int col)
    {
        if(a.length==row && a[0].length==col)
        {
            return;
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[row][i]==2)
            {
                System.out.println("milgya at "+row +" "+i);
            }
        }
//        System.out.println();
        recursiveIteration(a,row+1,col+1);
    }

    public static void main(String []args)
    {
//        int []m = {1,2,3,3,4,5};int elem = 6;
//        recursiveIteration(m,0);
//        System.out.println("Below..........");
//        System.out.println("\n"+linearSearch(m,elem,0,m.length-1));
//        System.out.println(linearSearch(m,elem,m.length));
//        System.out.println(recbinarySearch(m,elem,0,m.length-1));
        int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
        recursiveIteration(a,0,0);
    }
}
package com.practiceCode;
import java.util.HashSet;
import java.util.Set;
public class expert
{
    static boolean duplicate(int []a)
    {
        HashSet<Integer> s = new HashSet<>();
        for(int i:a)
            if(!(s.add(i)))
                return true;
        return false;
    }
    public static void main(String[] args)
    {
        int []n = {1,2,3,4,5,7};
        System.out.println(duplicate(n));
    }
}
//template's
package com.practiceCode;
public class expert {
    public static void main(String[] args) {
        System.out.println("Template's..........");
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;

public class expert {
    static void twoSum(int []a,int target){
        //brute force solution
        boolean flag = false;
        int []s = new int[2];
        for(int i=0;i<a.length;i++)
            if(!flag)
                for(int j=0;j<a.length;j++)
                    if(i != j && a[i]+a[j]==target){
                        s[0]=i;
                        s[1]=j;
                        flag=true;
                        break;
                    }
        System.out.println("BruteForce Solution:"+s[0]+" "+s[1]);

    }
    static int twoSum(int []a, int sum, int target, int ind, List<Integer> ans,boolean flag){
        if(ind == a.length)
        {
          if(target == sum && !flag){
              System.out.println(ans);
              flag = true;
              return 1;
          }
          return 0;
        }
        int l=0;int r=0;
           if(!flag)
           {
               ans.add(a[ind]);
               sum += a[ind];
                l = twoSum(a, sum, target, ind+1 , ans,flag);
               ans.remove(ans.size()-1);
               sum -= a[ind];
                r = twoSum(a, sum, target, ind + 1, ans,flag);
           }
//        System.out.println(l+r);
        return l+r;
    }
    public static void main(String[] args) {
        System.out.println("Two Sum..........");
        int []a = {3,2,4,5,6,2};
        int target = 8;
        System.out.println(twoSum(a,0,target,0,new ArrayList<>(),false));
    }
}

//50 x^n (x to the power of n)
package com.practiceCode;
public class expert {
    static double power(int x,int n){
        //bruteForce solution
        double sol = 1;
        if(n == 0){
            sol = x;
            return sol;
        }
        if(n < 0){
            n = -1*n;
            for(int i=0;i<n;i++){
                sol =(double)(sol * (double)1/x);
            }
        return sol;
        }
        if(n > 1){
            for(int i=0;i<n;i++){
                sol = sol * x;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int x = 3;int n=-2;
        System.out.println(power(x,n));
    }
}
//search in a 2D matrix
package com.practiceCode;
public class expert {
    static void searchingInMatrix(int [][]mat,int target){
        //brute force solution
        for(int i=0;i< mat.length;i++){
            for(int j=mat[0].length-1;j>=0;j--){
                if(target > mat[i][j]){
                    break;
                }else {
                    if(target == mat[i][j]){
                        System.out.println("mil gya: "+i+" "+j);break;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][]mat = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int target = 10;
        searchingInMatrix(mat,target);
    }
}
//reshape the matrix
package com.practiceCode;
public class expert {
    static void reshapeTheMatrix(int [][]m,int r,int c){
        int [][]ans = new int[r][c];int col = c;
        if(r*c != m.length*m[0].length){
            System.out.println("illegal");
            return;
        }
        if(m.length==1){
            System.out.println("already in the shape");
            return;
        }

        else if(m.length == r && m[0].length==c) {
            System.out.println("Dont change it");
            return;
        }

        else{
            for(int i=m.length-1;i>=0;i--){
                for(int j=m[0].length-1;j>=0;j--){
                        ans[r-1][c-1] = m[i][j];
                         c--;
                }
              }
           }
        for(int i=0;i<r;i++){
            for(int j=0;j<col;j++){
                System.out.print(ans[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int [][]m = {{1,2},{3,5}};
        int r = 4;int c= 1;
        reshapeTheMatrix(m,r,c);
    }
}
//intersection of two arrays
package com.practiceCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class expert {
    static void intersection(int []a,int []b){
        List<Integer> lst = new ArrayList<>();
        int k=0;int []c = new int[Math.min(a.length,b.length)];
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    lst.add(a[i]);
                    c[k] = a[i];k++;
                    count++;
                    break;}
            }
        }
        System.out.println(lst);
        for(int i=0;i<count;i++){
            System.out.print(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        int []a={1,2,2,1,5,4,9,0};int []b={2,2,2,3,0,8,9,4,9,5};
        intersection(a,b);
    }
}
//striver sde sheet solution
//73 - set matrix zero's
package com.practiceCode;
class solution{
    void traversal(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j =0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    //brute force solution
    void setMatrixZero(int [][]mat){
        System.out.println("Before, setting it zero");
        traversal(mat);
        boolean []r = new boolean[mat.length];
        boolean []c = new boolean[mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        //setting the zero
        int p=0;int l =0;
        for(int i=0;i< mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(r[i] || c[j]){
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println("After, setting it zero");
        traversal(mat);
    }

    //optimal solution
    void setZero(int [][]mat){
        int x=-1;int y=-1;
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0) y=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    mat[0][j]=mat[i][0]=0;
                }
            }
        }

        for(int i=mat.length-1;i>=0;i--){
            for(int j=mat[0].length-1;j>=0;j--){
                if(mat[i][0]==0 || mat[0][j]==0){
                    mat[i][j] = 0;
                }
                if(y==0){
                    mat[i][0]=0;
                }
            }
        }

        traversal(mat);
    }
}
public class expert {
    public static void main(String[] args) {
        int [][]matrix =   {{1, 2, 3},
                            {4, 0, 6},
                            {7, 8, 9}};
                            [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
                           expected : [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


        solution sol = new solution();
//        sol.setMatrixZero(matrix);
        sol.setZero(matrix);
    }
}
//permutation
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class solution{
    void traversal(int []a){
        for(int i:a)
            System.out.print(i+" ");
    }

    //Brute force solution:
    // i simply use map to store the status of an element that it is picked or not picked
    List<List<Integer>> permutation(int []a, List<Integer> ds, List<List<Integer>> ans, boolean []map){
        if(ds.size() == a.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }
        for(int i=0;i<a.length;i++){
            if(!map[i]){
                map[i] = true;
                ds.add(a[i]);
                permutation(a,ds,ans,map);
                ds.remove(ds.size()-1);
                map[i] = false;
            }
        }
        return ans;
    }

    void swap(int []a,int x,int y){
        int temp = a[x];
        a[x] = a[y];
         a[y] = temp;
    }

    //optimal solution of printing all the permutation of a given array
    List<List<Integer>> recPermutation(int []a,int ind,List<List<Integer>> ans){
        if(ind == a.length)
        {
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<a.length;i++)
            {
                ds.add(a[i]);
            }
            ans.add(new ArrayList<>(ds));
            return ans;
        }

        for(int i=ind;i<a.length;i++)
        {
            swap(a,ind,i);
            recPermutation(a,ind+1,ans);
            swap(a,ind,i);
        }
    return ans;
    }
}
public class expert {
    public static void main(String[] args) {
        int []a = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        boolean []map = new boolean[a.length];
        solution sol = new solution();
//        System.out.println(sol.permutation(a,ds,ans,map));
        System.out.println(sol.recPermutation(a,0,ans));
    }
}
//next permutation
package com.practiceCode;
import java.util.Arrays;
public class expert {

//    Brute force solution
//    1.First Find All the possible permutation of an array
//    2.sort it in increasing order
//    3.find the index of given array
//    4.your output would be in the index+1 place


    static void swap(int []a,int i,int j){
        int temp =  a[i];
        a[i] = a[j] ;
         a[j] = temp;
    }

    //optimal solution
    static void nextPermutation(int a[]){
        int index1 = 0;int index2 = 0;
        if(a.length>1){
            for(int i=a.length-2;i>=0;i--){
                if(a[i]<a[i+1]){
                    index1 = i;
                    break;
                }
            }
            for(int i=a.length-1;i>=0;i--){
                if(a[index1]<a[i]){
                    index2 = i;break;
                }
            }
           if(index1>0 || index2>0){
               swap(a,index1,index2);
               Arrays.sort(a,index1+1,a.length-1);
           }else {
               System.out.println("Simply sort");
               Arrays.sort(a);
           }
            for(int i:a){
                System.out.print(i+"  ");
            }
        }else{
            System.out.println("Zero size");
        }
    }
    public static void main(String[] args) {
        int []a = {3,2,1};
        nextPermutation(a);
    }
}
//50 pow(x,n)/*

/*package com.practiceCode;
public class expert {
    //Brute Force : using the inbuilt Math.Pow() Function
    static void brute_power(double x,int n){
        double power = 1f;
        boolean neg = false;
            if(n < 0){
                n = n * (-1);neg = true;
            }
            if(n == 0 || x==1){
                System.out.println(1);
                return;
            }
            if(n == 1){
                System.out.println(x);
                return;
            }
            for(int i=1;i<=n;i++){
                power = power * x;
            }
            if(neg){
                System.out.println("Lesser Than Zero");
                power = 1 / power;
                System.out.println(power);
            }else {
                System.out.println("Greater Than Zero");
                System.out.println(power);
            }
    }

    //optimal solution
    static double opti_power(double x,int n,double p,int ind,boolean neg){
        if(ind == n){
            if(neg){
                System.out.println("n is negative");
                p = 1 / p;
            }
            System.out.println(p);
            return p;
        }
        if(n == 0 || x==1){
            return 1;
        }
        if(n == 1){
            return x;
        }
        p = p * x;
        return opti_power(x,n,p,ind+1,neg);
    }
    public static void main(String[] args) {
//        0.00001
//        21474836
        //in this question, we have an integer x and power n. and our job is to find the value of x raised to the power n.
        double x = 0.00001;   //number
        int n = 21446;  //power
        boolean negative = false;
        if(n < 0){
            n = n*(-1);
            negative = true;
        }
//        brute_power(x,n);
        opti_power(x,n,1,0,negative);
    }
}
package com.practiceCode;
import org.w3c.dom.Node;
class linkedlist{
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }

    void printLinked(){
        Node temp  =head;
        while(temp != null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
        System.out.println();
    }

    void insertAtFirst(int data){
        Node temp = head;
        Node newNode = new Node(data);
        newNode.next = temp;
        head = newNode;
    }

    void insertAtLast(int data){
        Node newnode = new Node(data);
        Node tmp = head;
        while(tmp.next != null){
            tmp=tmp.next;
        }
        newnode.next = null;
        tmp.next = newnode;
    }

    void insertAtindex(int data,int pos){
        Node newnode = new Node(data);
        Node temp = head;
        int count = 1;
        while(count != pos-1){
            temp = temp.next;
            count++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    void deleteAtFirst(){
        Node tmp = head;
        head = tmp.next;
    }
    void deleteLast(){
        Node tmp = head;
        while(tmp.next.next != null){
            tmp=tmp.next;
        }
        tmp.next = null;
    }
    void deleteAtindex(int pos){//3
        Node tmp = head.next.next;
        Node prev = head;
        int count =1;
        if(tmp == null){
            return;
        }
        while(count != pos-1 && tmp.next != null){
            tmp=tmp.next;
            prev = prev.next;
            count++;
        }
        prev.next = tmp;
    }
}
public class expert {
    public static void main(String[] args) {
        linkedlist lost = new linkedlist();
        lost.head = new linkedlist.Node(10);
        lost.printLinked();
        lost.insertAtFirst(4);
        lost.insertAtFirst(2);
        lost.insertAtFirst(5);
        lost.printLinked();
        lost.insertAtLast(786);
        lost.printLinked();
        lost.insertAtindex(6,2);
        lost.printLinked();
        lost.deleteAtFirst();
        lost.printLinked();
        lost.deleteLast();
        lost.printLinked();
        lost.deleteAtindex(3);
        lost.deleteAtindex(3);
        lost.deleteAtindex(3);
        lost.printLinked();
    }
}
package com.practiceCode;
import org.w3c.dom.Node;
class linkedlist{
    Node head;
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            next=null;
        }
    }

    Node printLinked(Node temp){
//        Node temp  =head;
        while(temp != null){
            System.out.print(temp.val+"  ");
            temp = temp.next;
        }
        System.out.println();
        return temp;
    }

    Node reverseList(){
        Node prev = null;
        Node curr = head;
        if(head==null){
            System.out.println("Only one value");
            return head;
        }
        if(curr.next.next==null){
            System.out.println("Only two value");
            Node nextnode = curr.next;
            nextnode.next = curr;
            curr.next = prev;
            head = nextnode;
            return curr;
        }else{
            System.out.println("More than two value");
           while(curr != null){
               Node nextnod = curr.next;
               curr.next = prev;
               prev = curr;
               curr = nextnod;
           }
           printLinked(prev);
           return prev;
        }
    }
}
public class expert {
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.head = new linkedlist.Node(1);
        linkedlist.Node s = new linkedlist.Node(2);
        linkedlist.Node t = new linkedlist.Node(3);
        linkedlist.Node q = new linkedlist.Node(6);
        linkedlist.Node wt = new linkedlist.Node(7);
        list.head.next = s;
        s.next = t;
        t.next = q;
        q.next = wt;
        list.printLinked(list.head);
        list.reverseList();
    }
}
package com.practiceCode;

import java.util.Arrays;

public class expert {
    static void traversl(int []a){
        for(int i:a){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    static void  bruteForcemerge(int []a,int []b,int m,int n){
        int i=m;int j=0;
        while(i < m+n && j < n){
            a[i++] = b[j++];
        }
        Arrays.sort(a);
        traversl(a);
    }
    static void optimalMerge(int []a,int []b,int m,int n){
         int i=m-1;int j=n-1;int k= m+n-1;
        System.out.println("optimal");
         while(i>=0 || j>=0){
             if(i<0){
                 a[k--]=b[j--];
             }
             else if(j<0){
                 a[k--]=a[i--];
             }
             else if(a[i]>b[j]){
                 a[k--] = a[i--];
             }
             else{
                 a[k--] = b[j--];
             }
         }
         traversl(a);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the merging");
        int []a = {1,2,3,0,0,0};
        int []b = {2,3,4};
        int m=3;int n=3;
        traversl(a);
        traversl(b);
        optimalMerge(a,b,m,n);
    }
}
package com.practiceCode;
public class expert {
    static int recursion(int n){
        if(n == 0 || n==1){
            return 1;
        }else{
            return n * recursion(n-1);
        }
    }
    static void printArr(int []a,int i){
        if(i < a.length){
            System.out.print(a[i]+" ");
            printArr(a,i+1);
        }
    }
    static int sumOfarr(int []a,int i,int sum){
        if(i< a.length){
            sum =sum +  a[i];
            return sumOfarr(a,i+1,sum);
        }
        return sum;
    }
    static int twoSum(int []a,int i,int target,int sum){
        if(target==sum || i < a.length){
            System.out.println("mission completed");
            return 1;
        }
        else{
            sum = sum + a[i];
            return twoSum(a,i+1,target,sum);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(5));
        int []a = {1,2,3,4,5,6};
        printArr(a,0);
        System.out.println();
        System.out.println(sumOfarr(a,0,0));
        System.out.println(twoSum(a,0,8,0));
    }
}
package com.practiceCode;
import org.w3c.dom.Node;
class ListNode
{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }

    void printlist(ListNode head)
    {
        ListNode tmp = head;
        while(tmp != null)
        {
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    void reverse(ListNode head)
    {
        ListNode tmp = head;
        if(head.next==null)
        {
            System.out.println("Single Node");
            System.out.println(head.val);
        }
        else if(tmp.next.next == null)
        {
            System.out.println("Two Node");
            ListNode nextnode = tmp.next;
            nextnode.next = tmp;
            tmp.next = null;
            head = nextnode;
        }
        else
        {
            System.out.println("More than two nodes");
            ListNode prev = null;
            ListNode curr =  head;
            while(curr != null)
            {
                ListNode nexnode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nexnode;
            }
            printlist(prev);
        }
    }

    //21. Merge Two Sorted Lists
    void mergeSortedList(ListNode list1,ListNode list2)
    {
        ListNode curr1 = list1.head;
        ListNode curr2  =list2.head;


        ListNode dummy = new ListNode();
        ListNode tail = dummy;


        while(curr1 != null && curr2 != null)
        {
            if(curr1.val <= curr2.val){
                tail.next = curr1;
                curr1 = curr1.next;
            }
            else if(curr1.val > curr2.val)
            {
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }
        while(curr1 != null){
            tail.next = curr1;
            curr1 = curr1.next;
            tail = tail.next;
        }
        while(curr2 != null){
            tail.next = curr2;
            curr2 = curr2.next;
            tail = tail.next;
        }
        printlist(dummy.next);
    }
}

public class expert
{
    public static void main(String[] args)
    {
        ListNode list = new ListNode();
        ListNode list1 = new ListNode();
        list1.head = new ListNode(5);
        ListNode two = new ListNode(6);
        ListNode three = new ListNode(9);
        list1.head.next = two;
        two.next = three;
        list1.printlist(list1.head);

        ListNode list2 = new ListNode();
        list2.head = new ListNode(0);
        ListNode two2 = new ListNode(2);
        ListNode three3 = new ListNode(3);
        list2.head.next = two2;
        two2.next = three3;
        list2.printlist(list2.head);

        list.mergeSortedList(list1,list2);


    }
}
package com.practiceCode;
class ListNode
{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }

    //method to print the linked list
    void printlist(ListNode head){
        ListNode tmp = head;
        while(tmp != null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    void swapping(ListNode list,int k){
        ListNode ptr = list;
        int len = 0;
        while(ptr != null){
            ptr = ptr.next;
            len++;
        }
//        System.out.println("Length of the linked list is "+len);

        int p = len-k+1;int n=1;
        ListNode start = list;
        ListNode end = list;

        while(n != k){
            start = start.next;
            n++;
        }
        n= 1;
        while( n != p){
            end = end.next;
            n++;
        }

        int temp = start.val;;
        start.val = end.val;
        end.val = temp;

        ptr = list;
        printlist(ptr);
    }
}
public class expert {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.head = new ListNode(5);
        ListNode two = new ListNode(6);
        ListNode three = new ListNode(9);
        ListNode four = new ListNode(8);
        ListNode five = new ListNode(8);
        ListNode six = new ListNode(8);
        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        list.printlist(list.head);
        list.swapping(list.head,2);
    }
}
//two sum
//Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


//Buy and sell stock
//Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

package com.practiceCode;
import java.util.ArrayList;
class leetcode{
    void brutesolution(int []nums,int target){
        ArrayList ans = new ArrayList();
        boolean flag = false;
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length;j++){
                if(nums[i]+nums[j]==target && !flag){
                    ans.add(i);
                    ans.add(j);
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    void recursiveWay(int []nums,int target,int ind,int sum,ArrayList ans){
        if(ind >= nums.length || sum == target){
            System.out.println("Mission completed...");
            System.out.println(ans);
            return;
        }
        sum =sum+ nums[ind];
        ans.add(nums[ind]);
        recursiveWay(nums, target, ind+1, sum,ans);
        ans.remove(ans.size()-1);

    }
}
public class expert {
    public static void main(String[] args) {
        //Two sum problem where we have to find the index whose element achieve the given target by adding the two element;
        int []nums = {9,8,11,15};
        int target = 19;
        //instantiate the class object
        leetcode leet = new leetcode();
        //we have two to the solve the problem statemen
        //1.Brute force which is basic and mandatory to know: we can solve the problem statement by using the two for loop whose time time complexity would be O(n^2), which is not optimal
        leet.brutesolution(nums,target);
        //2.Optimal which,interviewer want:To solve the problem statement optimally we can use recursion to optimized the time complexity
        ArrayList n = new ArrayList();
        leet.recursiveWay(nums,target,0,0,n);
    }
}
//Intersection
//     Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//        Output: [4,9]
//        Explanation: [9,4] is also accepted.
package com.practiceCode;
import java.util.ArrayList;
public class expert {
    static void interSection(int []a,int []b){
        ArrayList ans = new ArrayList();
        boolean flag = false;
        for(int i=0;i<a.length;i++){
            flag = false;
               for(int j=0;j<b.length;j++){
                  if(!flag){
                      if(a[i]==b[j]){
                          ans.add(a[i]);flag=true;
                      }
                  }
           }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int []a = {0};
        int []b = {9,4,9,5,8,4};
        interSection(a,b);
    }
}
//Add two number
//Input: l1 = [2,4,3], l2 = [5,6,4]
//        Output: [7,0,8]
//        Explanation: 342 + 465 = 807.
package com.practiceCode;
class ListNode
{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }

    //method to print the linked list
    void printlist(ListNode head){
        ListNode tmp = head;
        while(tmp != null){
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    void addingTwoNumber(ListNode list1,ListNode list2){
        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int sum =0;int carry=0;

        while(l1 != null || l2 != null || carry==1){
            sum = 0;
            if(l1 != null){
                sum = sum + l1.val;
                l1= l1.next;
            }
            if(l2 != null){
                sum = sum + l2.val;
                l2= l2.next;
            }
            sum = sum + carry;
            carry = sum / 10;
            ListNode tmp = new ListNode(sum%10);
            tail.next = tmp;
            tail = tail.next;
        }
        System.out.println("Adding two Number");
        printlist(dummy.next);

    }
}
public class expert {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        ListNode list1 = new ListNode();
        list1.head = new ListNode(2);
        ListNode sec = new ListNode(4);
        ListNode thir = new ListNode(3);
        list1.head.next = sec;
        sec.next = thir;

        ListNode list2 = new ListNode();
        list2.head = new ListNode(5);
        ListNode fou = new ListNode(6);
        ListNode fiv = new ListNode(7);
        ListNode sex = new ListNode(9);
        list2.head.next = fou;
        fou.next = fiv;
        fiv.next = sex;

        list.printlist(list1.head);
        list.printlist(list2.head);

        list.addingTwoNumber(list1.head,list2.head);


    }
}
//print the subset of the array element
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
class subset{
    //Brute force approach
    void bruteForce(int []nums){
        List<List<Integer>> ans = new ArrayList<>();
        int sum=0;
        for(int i=0;i<Math.pow(2,nums.length);i++){
            int tmp = i;sum = 0;
            List l = new ArrayList();
            for(int j=nums.length-1;j>=0;j--){
                int rem =  tmp % 2;
                tmp = tmp / 2;
                if(rem==1){
                    sum += nums[j];
                }
            }
            l.add(sum);
            ans.add(l);
        }
        System.out.println(ans);
    }

    void optimalSol(int []nums,int ind,List<List<Integer>> ans,List tmp){
        if(ind == nums.length){
            System.out.println(tmp);
            ans.add(tmp);
            return;
        }
        tmp.add(nums[ind]);
        optimalSol(nums,ind+1,ans,tmp);
        tmp.remove(tmp.size()-1);
        optimalSol(nums,ind+1,ans,tmp);
    }

    List<List<Integer>> optimalSolSum(int []nums,int ind,List<List<Integer>> ans,List tmp,int sum){
        if(ind == nums.length){
            tmp.add(sum);
            ans.add(tmp);
            System.out.print(tmp+" ");
            return ans;
        }
        sum = sum + nums[ind];
        optimalSolSum(nums,ind+1,ans,tmp,sum);
        tmp.remove(tmp.size()-1);
        sum = sum-nums[ind];
        optimalSolSum(nums,ind+1,ans,tmp,sum);

        return ans;
    }

}
public class expert {
    public static void main(String[] args) {
        int []nums = {5,2,1};
        subset set = new subset();
//        set.bruteForce(nums);
//        set.optimalSol(nums,0,new ArrayList<>(),new ArrayList());
        set.optimalSolSum(nums,0,new ArrayList<>(),new ArrayList(),0);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
public class expert {
    static void twoSum(int []s, int i, int target, int sum, List ans){
        if(i>=s.length){
            if(target==sum){
                System.out.println(ans+""+sum);
            }
            return;
        }
        sum = sum + s[i];
        ans.add(i);
        twoSum(s,i+1,target,sum,ans);
        sum = sum - s[i];
        ans.remove(ans.size()-1);
        twoSum(s,i+1,target,sum,ans);
    }
    public static void main(String[] args) {
        int []a = {-2,4,6,-1};
        int target = 5;
        twoSum(a,0,target,0,new ArrayList());
    }
}
//Best time to buy and sell stock
package com.practiceCode;
public class expert {
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        //output = 5 (6 - 1);
        int profit=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>profit){
                   profit =  prices[j]-prices[i];
                }
            }
        }
        System.out.println(profit);
        //optimal solution
       int rofit = 0;
        int minsofart=0;
        int temp = 0;
        for(int i=0;i<prices.length;i++){
            temp=0;
            minsofart = Math.min(minsofart,prices[i]);
            temp = prices[i]-minsofart;
            rofit = Math.max(rofit,temp);
        }
        System.out.println(profit);
    }
}


//hackerank
package com.practiceCode;
public class expert {
    public static void main(String[] args) {
        int []arr = {1,-1,0,1,-1};
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
             zero++;
            }
            else if(arr[i]>=1){
                pos++;
            }else {
                neg++;
            }
        }
        float n = arr.length;
        float posratio =(pos/n);
        float negRatio =(neg/n);
        float zeroratio =(zero/n);
        System.out.println(String.format("%.6f",posratio));
        System.out.println(String.format("%.6f",negRatio));
        System.out.println(String.format("%.6f",zeroratio));
    }
}

//Hackerrank Time Conversion
//07:05:45PM ==> 19:05:45
//12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
//12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
package com.practiceCode;
public class expert {
    public static void main(String[] args) {
        String time = "12:05:45AM";
        String upDateTime="";
        if(time.charAt(time.length()-2)=='P'){
            if(time.substring(0, 2).equals("12")){
                System.out.println(time);
            }else{
                String update = time.substring(0,2);
                int upd = Integer.parseInt(update)+12;
                update = Integer.toString(upd)+":" + time.substring(3,time.length());
                System.out.println(update);
            }
        }else{
            if(time.substring(0, 2).equals("12")){
                upDateTime = "00:" + time.substring(3,time.length());
                System.out.println(upDateTime);
            }else{
                System.out.println("Leave it");
            }
        }
    }
}
//remove linkedlist element
package com.practiceCode;
class ListNode{
    ListNode head;
    ListNode next;
    int val;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    //method to print the linked list
    void printlist(ListNode head) {
        ListNode tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    void removeNode(ListNode list, int val){
        ListNode curr = list;
        if (list == null) {
            System.out.println("__");
            return;
        }

        while(list.val==val){
            list = list.next;
            if(list==null){
                return;
            }
        }

        curr = list;
        while (curr.next != null ) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        printlist(list);
    }
}
 public class expert {
        public static void main(String[] args) {
            ListNode list = new ListNode();
            list.head = new ListNode(3);
            ListNode two = new ListNode(6);
            ListNode three = new ListNode(9);
            ListNode four = new ListNode(6);
            ListNode five = new ListNode(8);
            ListNode six = new ListNode(3);
            list.head.next = two;
            two.next = three;
            three.next = four;
            four.next = five;
            five.next = six;
            list.printlist(list.head);
            list.removeNode(list.head,3);
        }
}
//merge sort
package com.practiceCode;
class mergesort{
    void traversal(int []a){
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    int[] merge(int []n1,int []n2){
        int m = n1.length;int n = n2.length;
        int []marr = new int[m+n];
        int i=0;int j=0;int k=0;

        if(m==0 && n==0){
            return marr;
        }

        while(i<m && j<n){
            if(n1[i]<n2[j]){
//                System.out.println("PPPP");
                marr[k] = n1[i];
                i++;
            }else{
                marr[k] = n2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            marr[k] = n1[i];
            k++;i++;
        }
        while(j<n){
            marr[k] = n2[j];
            k++;j++;
        }
        return marr;
    }
}
public class expert {
    public static void main(String[] args) {
        mergesort m = new mergesort();
        int []a  = {1,2,5,9};
        int []aa = {0,3,4,6};
        m.traversal(a);
        m.traversal(aa);
        m.merge(a,aa);
        int []res = new int[a.length+aa.length];
        res = m.merge(a,aa);
        m.traversal(res);
    }
}
//stack implementation
package com.practiceCode;
class stack{
    int size;
    int []arr = new int[size];
    int top = -1;
    stack(){}
    stack(int size){
        this.size = size;
        arr = new int[size];
    }

    void push(int elem) {
        if (size-1 == top) {
            System.out.println("Stack is Full");
            System.exit(1);
        } else {
            top++;
            arr[top] = elem;
        }
    }

    int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        int popElem = arr[top];
        top--;
        System.out.println(popElem+" is popped");
        return popElem;
    }

    void stackElem(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
class queue{
//    int size;
//    int []arr = new int[size];
//    int front = -1;int rear = -1;
//    int currSize= 0;
//
//    queue(){}
//    queue(int size){
//        this.size = size;
//        arr = new int[size];
//    }
//
//    void push(int Elem){
//        if(currSize == size-1){
//            System.out.println("Queue is Full !!");
//            System.exit(1);
//        }
//        else{
//            if(rear ==-1){
//                rear =0;front=0;
//            }
//            rear = (rear+1)%size;
//            arr[rear] = Elem;
////            System.out.println("The element pushed is " + Elem);
//            currSize++;
//        }
//    }
//
//    void pop(){
//        if (currSize == 0) {
//            System.out.println("Queue Empty\nExiting...");
//            System.exit(1);
//        }
//        int popped = arr[front];
//        if (currSize == 1) {
//            front = -1;
//            rear = -1;
//        }
//        front = (front + 1) % size;
//        System.out.println(popped+" is popped");
//        currSize--;
//    }
//
//    void printQueu(){
//        for(int i=front+1;i<=rear;i++){
//            System.out.print(arr[i%arr.length]+"  ");
//        }
//        System.out.println();
//    }
    int size;
    int []arr = new int[size];
    int curr = 0;
    int front =-1;
    int rear = -1;

    queue(){}
    queue(int size){
        this.size = size;
        arr = new int[size];
    }

    void push(int elem){
        if(curr == arr.length-1){
            System.out.println("Queueu is full");
        }else{
            if(rear == -1){
                rear = 0;front = 0;
            }
            rear = (rear+1)%size;
            arr[rear] = elem;
            curr++;
        }
    }

    void pop(){
        if(curr == 0){
            System.out.println("queue khaali hai");
        }else{
            int poped = arr[front];
            front = (front+1)%size;
            if(curr == 1){
                front = -1;rear = -1;
            }
            System.out.println(poped+" is poped");
            curr--;
        }

    }

    void print(){
        for(int i=front;i<=rear;i++)
            System.out.println(arr[i%arr.length]);
    }
}

public class expert {
    public static void main(String[] args) {
//     stack st = new stack(5);
//     st.push(1);
//     st.push(2);
//     st.push(3);
//     st.push(4);
//     st.push(5);
//     st.stackElem();
//     st.pop();
//     st.pop();
//     st.stackElem();

        queue q = new queue(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.print();
        q.pop();
        q.pop();
        q.print();
    }
}
//valid parenthesis
package com.practiceCode;
import java.util.Stack;
class stack{
    int size;
    char []arr = new char[size];
    int top = -1;
    stack(){}
    stack(int size){
        this.size = size;
        arr = new char[size];
    }

    void push(char elem) {
        if (size-1 == top) {
            System.out.println("Stack is Full");
            System.exit(1);
        } else {
            top++;
            arr[top] = elem;
            System.out.println(elem+" is push");
        }
    }

    char pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            System.exit(1);
        }
        char popElem = arr[top];
        top--;
        System.out.println(popElem+" is popped");
        return popElem;
    }

    void stackElem(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
public class expert {
    public static void main(String[] args) {
        String str = "([]){}";
        int len = str.length();
        stack s = new stack(len);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                s.push(str.charAt(i));
            }else{
                char tmp = s.pop();
            }
        }
    }
}
//merge sort by self
package com.practiceCode;
class mergesort{
    void traversal(int []a){
        for(int  i:a){
            System.out.print(i+"  ");
        }
        System.out.println();
    }
    void merge(int []nums,int low,int mid,int high){
        int []tmp = new int[nums.length];
        int k=low;
        int i=low;int j=mid+1;

        while(i<=mid && j<=high){
            if(nums[i]>nums[j]){
                tmp[k++] = nums[j++];
            }else{
                tmp[k++]=nums[i++];
            }
        }

        while(i<=mid){
            tmp[k++] = nums[i++];
        }
        while(j<=high){
            tmp[k++] = nums[j++];
        }

        for(int q=low;q<=high;q++){
            nums[q] = tmp[q];
        }

    }
    void sortmerge(int []nums,int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            sortmerge(nums,low,mid);
            sortmerge(nums,mid+1,high);
            merge(nums,low,mid,high);
        }
    }
}
public class expert {
    public static void main(String[] args) {
        int []nums = {5,2,1,0,9,0,-4,3,-4,1};
        mergesort m = new mergesort();
        System.out.println("Before Sorting");
        m.traversal(nums);
        m.sortmerge(nums,0,nums.length-1);
        System.out.println("After Sorting");
        m.traversal(nums);
    }
}
package com.practiceCode;
import java.util.HashSet;
import java.util.LinkedList;

public class expert {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        int []m  = {1,2,2,3,3,4,5,1};
        for(int i=0;i<m.length;i++){
            if(!s.add(m[i])){
                System.out.println(m[i]);
            }
        }
    }
}
package com.practiceCode;
import java.util.Scanner;
public class expert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = 0;
        System.out.println("Enter N");
        N = s.nextInt();

        int[] data = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("Enter data");//85 25 65 21 84
            data[i] = s.nextInt();
        }
        int num = 0;int rm = 1;
        for(int i=0;i<N;i++){
            int p= (int)Math.pow(10,N);
            int temp = data[i]%10;
            if(p>0){
                rm = p*temp;
                p = p /  10;
                num = num + rm;
                System.out.println(num);
            }
        }

        System.out.println("Ans");
        System.out.println(num);
    }
}

package com.practiceCode;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class leetcode{
    int[] twosum(int []a,int target){
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int []result = new int[2];
        for(int i=0;i<a.length;i++){
            if(map.containsKey(target-a[i])){
                result[0]=map.get(target-a[i]);
                result[1] = i;
                return result;
            }
            map.put(a[i],i);
        }
        return result;
    }
}
public class expert {
    public static void main(String[] args) {
        int []arr = {2,1,4,3,-6,4,1};
        int target = 8;
        leetcode l = new leetcode();
        int []res = l.twosum(arr,target);
//        res = l.twosum(arr,target);
        for(int i=0;i<2;i++){
            System.out.println(res[i]);
        }
    }
}
//Remove duplicate nodes from the linkedlist
package com.practiceCode;
class ListNode
{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }

    void printlist(ListNode head)
    {
        ListNode tmp = head;
        while(tmp != null)
        {
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    void removeDuplicate(ListNode head){
        ListNode curr = head;
        if(head==null){
            return;
        }else if(head.next==null){
            return;
        }else if(head.next.next ==null){
            if(head.val==head.next.val){
                head.next = null;
            }
        }
        else{
            while(curr.next != null ){
                if(curr.val == curr.next.val){
                    curr.next = curr.next.next;
                }else{
                curr = curr.next;
            }
            }
        }
        System.out.println("After Reomving the Duplicate Node");
        printlist(head);

    }
}

public class expert{
    public static void main(String[] args) {
        ListNode list = new ListNode();
        list.head = new ListNode(1);
        ListNode two = new ListNode(11);
        ListNode three = new ListNode(11);
        ListNode four = new ListNode(11);
        ListNode five = new ListNode(11);
        list.head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        list.printlist(list.head);
        list.removeDuplicate(list.head);

    }
}
package com.practiceCode;
class leetcode{
    void traversal(int [][]a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    void reshapethematrix(int [][]mat,int r,int c){
        if(mat.length==0){
            return;
        }
        else if(mat.length==1 && mat[0].length==1){
            return;
        }else{
            if(mat.length*mat[0].length!=r * c || (mat.length==r && mat[0].length==c)){
                System.out.println("Illegal weapon");
                System.exit(1);
            }else {

                int p=0;int k=0;
                int [][]arr = new int[r][c];
                for(int i=0;i<mat.length;i++){
                  for(int j=0;j<mat[0].length;j++){
                     if(k<c){
                         arr[p][k] = mat[i][j];k++;
                     }else{
                         k=0;p++;arr[p][k] = mat[i][j];k++;
                     }
                  }
              }
                traversal(arr);
            }


        }
    }
}
public class expert {
    public static void main(String[] args) {
        int [][]arr = {{1,2},{3,4},{8,5},{6,9}};
        leetcode l = new leetcode();
        l.traversal(arr);
        l.reshapethematrix(arr, 2,4);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class expert {
    static void intersection(int []a,int []b){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:a){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        List list = new ArrayList<>();
        for(int i:b){
          if(map.get(i) != null && map.get(i)>=1){
            list.add(i);
            map.put(i,map.get(i)-1);
          }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int []a = {1,2,2,1,3,3};
        int []b = {1,2,2};
        intersection(a,b);
    }
}
//Valid parenthesis
package com.practiceCode;
import java.util.Stack;
public class expert {
    static boolean isValidParenthesis(String str){
        Stack<Character> stack = new Stack<>();
        char []c = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(c[i]=='(' || c[i]=='[' || c[i]=='{'){
                stack.push(c[i]);
            }else {
                if(stack.isEmpty()) return false;
                else{
                    char popitem = stack.pop();
                    if(c[i] == ')' && popitem !='('){
                        return false;
                    }
                    else if(c[i] ==']' && popitem != '['){
                        return false;
                    }else if(c[i]=='}' && popitem != '{'){
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        String str ="({{}}[])";
        System.out.println(isValidParenthesis(str));

    }
}
//first unioque string
package com.practiceCode;

import java.util.HashMap;
import java.util.Map;

public class expert {
    //Gives Tle
    static int firstUnique(String str){
        int count = -1;
        for(int i=0;i<str.length();i++){
            count= -1;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i) == str.charAt(j) && i != j){
                    count++;
                }
            }
            if(count == -1){
                System.out.println(str.charAt(i)+" "+i);
                count = i;return i;
            }
        }
        return -1;
    }

    static void uniqueLetter(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char a:str.toCharArray()){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }

        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println(str.charAt(i));
            }
        }
    }
    public static void main(String[] args) {
        String str ="kk";
       int n =  firstUnique(str);
        System.out.println(n);
    }
}

//Three sum: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.
//Input: nums = [-1,0,1,2,-1,-4]
//      Output: [[-1,-1,2],[-1,0,1]]

package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
class leetcode{
    void threeSum(int []nums, int ind, List ds,List ans,int sum){
        if(ind >= nums.length){
            if(ds.size() == 3 && sum == 0){
//                System.out.println(ds);
                ans.add(ds);
                System.out.println(ans);
                return;
            }
            return;
        }
        ds.add(nums[ind]);
        sum = sum  + nums[ind];
        threeSum(nums,ind+1,ds,ans,sum);
        ds.remove(ds.size()-1);
        sum = sum - nums[ind];
        threeSum(nums,ind+1,ds,ans,sum);
    }
}
public class expert {
    public static void main(String[] args) {
        int []nums = {-1,0,1,2,-1,-4};
        leetcode leet = new leetcode();
        leet.threeSum(nums,0,new ArrayList(),new ArrayList(),0);
    }
}
package com.practiceCode;
import org.w3c.dom.Node;
class ListNode
{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val)
    {
        this.val = val;
        this.next = null;
    }

    void printlist(ListNode head)
    {
        ListNode tmp = head;
        while(tmp != null)
        {
            System.out.print(tmp.val+" ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    void rotateList(ListNode head,int k){
        System.out.println("Rotate");
        if(head == null || head.next == null || k==0)  return;

        int n= 0;

        ListNode cur = head;
        while(cur !=  null)  n++;cur = cur.next;

        if(k % n == 0)  return;

           while(k > 0){
               ListNode curr = head;
               while(curr.next.next != null){
                   curr = curr.next;
               }
               ListNode s = head;
               head = curr.next;
               head.next = s;
               curr.next = null;
               printlist(head);
               k--;
           }
    }
}

public class expert
{
    public static void main(String[] args)
    {
        ListNode list = new ListNode();
        list.head = new ListNode(5);
        ListNode two = new ListNode(6);
        ListNode three = new ListNode(9);
        list.head.next = two;
        two.next = three;
        list.printlist(list.head);
        list.rotateList(list.head,2);
    }
}
//Longest Substring without repeating character
package com.practiceCode;
import java.util.HashMap;
import java.util.Map;
public class expert {
    public static void main(String[] args) {
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        String s = "aabbvcbbbaaa";
        int temp = 0;int max = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                System.out.println(s.charAt(i));
                temp = map.size();
                if(max <= temp){
                    max = temp;
                }
            }else{
//               System.out.println(map.size());
                temp = map.size();
                if(max <= temp){
                    max = temp;
                }
                map.clear();i = i-1;
                System.out.println("After");
            }
        }
        System.out.println(max);
    }
}
package com.practiceCode;
public class expert{
    static String spaceremover(String str){
        str  = str.trim();
        String update = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)== ' ' && str.charAt(i+1) != ' '){
            update = update + ' ';
          }
            else if(str.charAt(i)!=' '){
                update = update + str.charAt(i);
            }
        }
//        System.out.println(update.length());
//        System.out.println(update);
        return update;
    }

    static void reverseString(String str){
        String []arr = spaceremover(str).split(" ");
        String rev = "";
        for(int i=arr.length-1;i>=0;i--){
            if(i == arr.length-1){
                rev =arr[i];
            }else{
                rev = rev+" "+arr[i];
            }
        }
        System.out.println(rev);
    }
    public static void main(String []args){
        String str = "the sky is                                               blue                   ";
      reverseString(str);
    }
}

//Longest palindromic Substring
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;
public class expert {
    static boolean isPlaindrome(String str,int i,int j){
        if(i >= j){
            return true;
        }
        while (str.charAt(i) != str.charAt(j)){
            return false;
        }
        return isPlaindrome(str,i+1,j-1);
    }

    static String substringSubset(String s, int i,int j){
        if(s.length()==1) return s;
        if(i >= s.length()){
            return "";
        }
        if(isPlaindrome(s,i,j)){
            String pal = "";
            for(int p=i;p<=j;p++){
                pal += s.charAt(p);
            }
//            System.out.println(pal);
            return pal;
        }else{
            return substringSubset(s,i,j-1);
        }
    }


    public static void main(String[] args) {
    String str = "aacabdkacaa";
    List<String> lia = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            String ans  = "";
                ans =  substringSubset(str,i,str.length()-1);
                   lia.add(ans);
        }
        int max = 0;
        String an = "";
        for(int i=0;i<lia.size();i++){
            if(lia.get(i).length() >  max){
                max = lia.get(i).length();
                an = lia.get(i);
            }
        }
        System.out.println(lia);
        System.out.println(an);
    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class expert {
    public static void main(String[] args) {
       int []arr = {1,1,1,1,2,2,2,3,3,3};
       int k = 3;
       Map<Integer,Integer> map  = new HashMap<Integer,Integer>();
       for(int a:arr){
           if(map.containsKey(a)){
               map.put(a,map.get(a)+1);
           }else{
               map.put(a,1);
           }
       }
        List ans = new ArrayList();
       for(Map.Entry<Integer,Integer> iterator:map.entrySet()){
           System.out.println(iterator.getKey()+"=>"+iterator.getValue());
           if(iterator.getValue()>=k){
               ans.add(iterator.getKey());
           }
       }
        System.out.println(ans);
    }
}
package com.practiceCode;
class ListNode{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    void print(){
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
public class expert {
    public static void main(String []args){
        System.out.println("Hello World");
        ListNode list = new ListNode();
        list.head = new ListNode(10);
        ListNode two = new ListNode(20);
        ListNode three = new ListNode(30);
        list.head.next = two;
        two.next = three;
        list.print();
    }
}
package com.practiceCode;
class sort{
    void traversal(int  []arr){
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
    void bubblesort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int  j=0;j<arr.length-i;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
public class expert{
    public static void main(String []args){
        int []arr = {2,5,7,-7,0,1};
        sort sort = new sort();
        System.out.println("Unsorted Array");
        sort.traversal(arr);
        sort.bubblesort(arr);
        System.out.println("sorted Array");
        sort.traversal(arr);

    }
}
//Tree Data Structure using Java
package com.practiceCode;
import java.util.Scanner;
import java.util.TreeSet;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val){
        this.val = val;
    }
}
class BinaryTree{
    //no need to do this way bcz it is hectic to take the input always from the user side
    //Using the below method we takes val of the nodes from the user...
    public TreeNode createTree(){
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;
        System.out.println("Enter data: ");
        int val = sc.nextInt();

        if(val == -1) return  null;

        root = new TreeNode(val);

        System.out.println("Enter Left For: "+val);
        root.left = createTree();

        System.out.println("Enter Right For: "+val);
        root.right = createTree();

        return root;
    }

    //method to print value
    public void inorderTraversal(TreeNode root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.print(root.val+" ");
        inorderTraversal(root.right);
    }
}
class Tree{
    TreeNode root;
    //method for traversing the tree
    public void traverse(TreeNode root){
        if(root == null) return;
        if (root != null){
            traverse(root.left);
            System.out.print(root.val+" ");
            traverse(root.right);
        }
    }

    public int summation(TreeNode root,int sum){
        if(root == null) return sum;
        sum = summation(root.left,sum);
        if(root.val>= 2 && root.val <=8){
            sum = sum + root.val;
        }
        sum = summation(root.right,sum);
        return sum;
    }
}
public class expert {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = new TreeNode(2);
        tree.root.left = new TreeNode(3);
        tree.root.right = new TreeNode(4);
        tree.root.left.left = new TreeNode(6);
        tree.root.left.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(7);
        tree.root.right.right = new TreeNode(7);
        tree.traverse(tree.root);
        System.out.println();
        System.out.println(tree.summation(tree.root,0));


    }
}
package com.practiceCode;
import java.util.ArrayList;
import java.util.List;

class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class tree{
    TreeNode root;
    public void inorder(TreeNode root){
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val+"  ");
        inorder(root.right);
    }

    public List<Integer> Inorder(TreeNode root,List<Integer> ans){
        if (root == null) return ans;
        Inorder(root.left,ans);
        ans.add(root.val);
        Inorder(root.right,ans);
        return ans;
    }
}
public class expert {
    public static void main(String[] args) {
        tree tre = new tree();
        tre.root = new TreeNode(10);
        tre.root.left = new TreeNode(20);
        tre.root.right = new TreeNode(30);
        tre.root.left.left = new TreeNode(40);
        tre.root.left.right = new TreeNode(50);
        tre.root.right.left = new TreeNode(60);
        tre.root.right.right = new TreeNode(70);
//        tre.inorder(tre.root);
        List<Integer> ans =new ArrayList<>();
        ans = tre.Inorder(tre.root,new ArrayList<>());
        System.out.println(ans);

    }
}
package com.practiceCode;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class tree{
    TreeNode root;
    int heightOfthetree(TreeNode root){
        if(root == null)  return 0;
        return Math.max(heightOfthetree(root.left),heightOfthetree(root.right))+1;
    }
}
public class expert {
    public static void main(String[] args) {
        tree tre = new tree();
        tre.root = new TreeNode(10);
        tre.root.left = new TreeNode(20);
        tre.root.right = new TreeNode(30);
        tre.root.left.right = new TreeNode(50);
        tre.root.right.left = new TreeNode(60);
        tre.root.right.right = new TreeNode(70);
        tre.root.left.left = new TreeNode(40);
        tre.root.left.left.left = new TreeNode(80);
        int ht  = tre.heightOfthetree(tre.root);
        System.out.println("Height of the tree is : "+ht);
    }
}
package com.practiceCode;
import javax.swing.tree.TreeNode;
class Node{
    int val;
    Node left;
    Node right;
    Node(){}
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class Binarytree{
    Node root;
    void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    int evaluateTree(Node root){
        if(root == null)  return 0;

        if(root.val == 3){
            if(evaluateTree(root.left) == 1 && evaluateTree(root.left) == 1){
                return 1;
            }else{
                return 0;
            }
        }else{
            if(evaluateTree(root.left) == 0 && evaluateTree(root.right) == 0){
                return 0;
            }else{
                return 1;
            }
        }
    }
}

public class expert {
    public static void main(String[] args) {
        Binarytree bt = new Binarytree();
        bt.root = new Node(2);
        bt.root.left = new Node(1);
        bt.root.right = new Node(3);
        bt.root.right.left = new Node(0);
        bt.root.right.right = new Node(1);
        bt.preOrder(bt.root);
        System.out.println();
        System.out.println(bt.evaluateTree(bt.root));
    }
}
package com.practiceCode;
import java.util.ArrayList;
public class expert {
    public static void main(String[] args) {
        int num  = 25143;
        ArrayList<Integer> list = new ArrayList();
        while(num > 0){
            int rem = num % 10;
            list.add(rem);
            num = num / 10;
        }
//        System.out.println(list);

        ArrayList<Integer> lis2 = new ArrayList<>();
        for(int i =list.size()-1;i>=0;i--){
            lis2.add(list.get(i));
        }

//        System.out.println(lis2);
        ArrayList<Integer> newarr = new ArrayList<>();
        for(int i=0;i<lis2.size();i++){
            int tmp = ((i+3) % lis2.size());
            newarr.add(lis2.get(tmp));
        }
//        System.out.println(newarr);


        int ans = 1;
        int tn = 1;
        for(int i=0;i<list.size();i++){
            ans = ans*tn + newarr.get(i);
            tn = tn * 10;
        }
        System.out.println(ans);
    }
}
package com.practiceCode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class expert {
    public static void main(String[] args) {
        String str = "abcdef";
        String str1 = "abcde";
        Map<Character,Integer> map = new HashMap<>();
        for(int i= 0;i<str1.length();i++){
            map.put(str1.charAt(i),1);
        }

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                continue;
            }else{
                System.out.println(str.charAt(i));
            }
        }
    }
}
package com.practiceCode;
public class expert{
    public static void main(String[] args) {
        int num  = 124578;

        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            if(rem % 2 == 1){
                ans += rem;
            }
            num /= 10;
        }
        System.out.println(ans);
    }
}


package com.practiceCode;
class pattern{
    void square(){
        //* * * * * *
        //*         *
        //*         *
        //*         *
        //*         *
        //* * * * * *
        for(int i=0;i<6;i++){
            for(int  j=0;j<6;j++){
                if(i==0 || i==5){
                    System.out.print("* ");
                }
                else if(j==0 ||j==5){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
//                 1
//                 *
//                * *
//               * * *
//              * * * *
//             * * * * *


    void triangle1(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void triangle2(){
        for(int i = 0;i<5;i++){
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void triangle3(){
        for(int i=5;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
public class expert {
    public static void main(String[] args) {
      pattern pattern = new pattern();
//      pattern.square();
//      pattern.triangle1();
//      pattern.triangle2();
//      pattern.triangle3();
    }
}

package com.practiceCode;
class basic{
   void oddEven(int n){
       if(n % 2 == 0){
           System.out.println(n +" Is Even No.");
       }else{
           System.out.println(n+" Is Odd No.");
       }
   }

   void Isprime(int n){
       if(n == 0 || n == 1){
           System.out.println("Prefer Not To Stay");
           System.exit(1);
       }else if(n == 2){
           System.out.println("Prime Number");
           return;
       }else{
           int count = 2;
           for(int i = 2;i<n/2;i++){
               if(n % i == 0){
                   count++;
               }else if(count > 2){
                   System.out.println("Not a prime Number");
                   return;
               }
           }
           System.out.println("Prime Number");
       }
   }

   int factorial(int n){
       if(n==0 || n == 1){
           return 1;
       }
       return factorial(n-1)*n;
   }

}
class sort{
    void traversal(int []nums){
        for(int a:nums){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    void bubbleSort(int []nums){
        for(int i=0;i< nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    void insertionSort(int []nums){
        System.out.println("Insertion Sort");
    }
    void Selection(int []nums){
        System.out.println("Selection Sort");
    }
    void mergeSort(int []nums){
        System.out.println("merge Sort");
    }
    void quickSort(int []nums){
        System.out.println("quick Sort");
    }
    void heapSort(int []nums){
        System.out.println("heap Sort");
    }
}
class string{}
class array{}
public class expert {
    public static void main(String[] args) {
        basic practice = new basic();
        practice.oddEven(10);
        practice.Isprime(9973);
        System.out.println(practice.factorial(5));

        int []a = {1,-2,3,9,-7,15,0,-2};
        sort sort = new sort();
        System.out.println("Unsorted Array");
        sort.traversal(a);
        sort.bubbleSort(a);
        System.out.println("Sorted Array");
        sort.traversal(a);

    }
}
package com.practiceCode;
import java.util.HashMap;
import java.util.Map;
public class expert {
    static void isIsomorphic(String s,String t){
        if(s.length() != t.length())  return ;
        if(s.length() == 0 && t.length() == 0) return ;
        if(s.length() == 1 && (s.charAt(0) == t.charAt(0))) return ;
        Map<Character,Character> map = new HashMap<Character,Character>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)) || map.containsValue(t.charAt(i))){
                if( t.charAt(i) != map.get(s.charAt(i))){
                    System.out.println(t.charAt(i) +" is not same as "+map.get(s.charAt(i)));
                }
            }else{
                if(map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                }else
                {
                    return;
                }
            }
        }
        for(Map.Entry<Character,Character> iter : map.entrySet()){
            System.out.println(iter.getKey()+" = = = > "+iter.getValue());
        }

      return ;
    }
    public static void main(String[] args) {
        String s = "baba";
        String t = "badc";
        isIsomorphic(s,t);

    }
}
package com.practiceCode;
class ListNode{
    int val;
    ListNode next;
    ListNode head;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    void printNode(ListNode head){
        while(head != null){
            System.out.print(head.val+" ");
            head = head.next;
        }
    }

    void reverseList(ListNode head){
        if(head == null || head.next == null){
            printNode(head);
            return;
        }

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null){
            ListNode nextnode = curr.next;
            curr.next = prev;

            //update all the nodes
            prev = curr;
            curr = nextnode;
        }
        printNode(prev);
    }

    void mergeLinkedList(ListNode list1,ListNode list2){
//        printNode(list1.head);
        ListNode curr1 = list1.head;
        ListNode curr2 = list2.head;
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(curr1 !=  null && curr2 != null){
            if(curr1.val <= list2.val){
                tail.next = curr1;
                curr1 = curr1.next;
            }else if(curr2.val < curr1.val){
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }
        System.out.println();
        printNode(dummy.next);
    }

}
public class expert {
    public static void main(String[] args) {
        ListNode list = new ListNode();
        ListNode node = new ListNode(4);
        ListNode node2 = new ListNode(4);
        node.head = new ListNode(6);
        ListNode sec = new ListNode(1);
        ListNode third = new ListNode(3);
        ListNode four = new ListNode(8);
        node.head.next = sec;
        sec.next = third;
        third.next = four;
        node.printNode(node.head);
        System.out.println();
        node2.head = new ListNode(2);
        ListNode two = new ListNode(5);
        ListNode tre = new ListNode(6);
        ListNode fou = new ListNode(7);

        node2.head.next = two;
        two.next = tre;
        tre.next = fou;
        node2.printNode(node2.head);

        list.mergeLinkedList(node,node2);
    }
}
package com.practiceCode;
import java.util.List;
class ListNode{
    ListNode head;
    ListNode next;
    int val;
    ListNode(){}
    ListNode(int val){
        this.val = val;
        this.next = null;
    }

    void printList(ListNode head){
        while(head != null){
            System.out.print(head.val+"-");
            head = head.next;
        }
        System.out.println();
    }

    void creation(ListNode list,int val){
        ListNode curr = new ListNode(val);
        if(list.head == null){
            list.head = curr;
        }else{
            ListNode tmp = list.head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = curr;
        }
    }

    void insertAtFirst(ListNode list,int val){
        ListNode curr  =new ListNode(val);
        if(list.head == null){
           list.head =  curr;
       }else{
            ListNode tmp  = list.head;
            list.head = curr;
            curr.next = tmp;
        }
    }

    void mergesorted(ListNode list1,ListNode list2){
        ListNode curr1 = list1.head;
        ListNode curr2 = list2.head;

        if(curr1 == null && curr2 == null) {
            System.out.println("Return");
            return;
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while(curr1 != null && curr2 != null)
        {
//            System.out.println(curr1.val +" " + curr2.val);
            if(curr1.val <= curr2.val){
                tail.next = curr1;
                curr1 = curr1.next;
            }
            else if(curr1.val > curr2.val)
            {
                tail.next = curr2;
                curr2 = curr2.next;
            }
            tail = tail.next;
        }

        while(curr1 != null){
            tail.next = curr1;
            curr1 = curr1.next;
            tail = tail.next;
        }
        while(curr2 != null){
            tail.next = curr2;
            curr2 = curr2.next;
            tail = tail.next;
        }
        printList(dummy.next);
    }
}
public class expert {
    public static void main(String[] args) {
        ListNode node = new ListNode();
        ListNode node1 = new ListNode();
        ListNode node2 = new ListNode();
        node.creation(node1,0);
        node.creation(node1,2);
        node.creation(node1,5);
        node.creation(node1,6);
        node.printList(node1.head);

        node.creation(node2,0);
        node.creation(node2,4);
        node.creation(node2,7);
        node.creation(node2,9);
        node.printList(node2.head);

        node.mergesorted(node1,node2);

    }
}
package com.practiceCode;
public class expert {
    public static void main(String[] args) {
        String name  = "mdshoaibakhtar";
        String temp = "";
        for(int i=name.length()-1;i>= 0;i--){
            temp += name.charAt(i);
        }
        System.out.println(temp);

    }
}
package com.practiceCode;
class mathematics{
    void oddEven(int n){
        if(n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    void prime(int n){
        int ans = 0;
        for(int i=2;i<n/2;i++){
            if(n % i == 0){
                ans++;
            }
            if(ans >= 1){
                System.out.println("Not a Prime");
                System.exit(1);
            }
        }
        System.out.println("Prime");
    }

    void nthTermVal(int a,int d,int n){
        int ans = 0;
        ans  = a + (n-1)*d;
        System.out.println(ans);
    }

    void nthTerm(int a,int d,int val){
        int n = 0;
        n = ((val - a)/d)+1;
        System.out.println(n);

    }

}
public class expert {
    public static void main(String[] args) {
        mathematics math = new mathematics();
        math.oddEven(11);
        math.prime(29);
        math.nthTermVal(4,2,5);
        math.nthTerm(4,2,12);
        math.closestNumber(10,4);

        int p = -1;
        System.out.println(p>>>30);
        System.out.println(p>>>31);
}
}*/
// Happy Coding
package com.practiceCode;
public class expert {
    public static void main(String[] args) {
        System.out.println("Happy Coding");
    }
}









