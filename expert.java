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
package code.solution;
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
        String s = "car";
        String t = "rat";
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
}
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
}*/
//Sorting
/*
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

    static void swapArr(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    static void sortMatrix(int [][]arr)
    {
        int temp ;int p=arr[0].length;
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
        sortMatrix(arr);
    }
}
//merge Sort
package code.solution;
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

    static void mergee(int []arr,int low,int mid,int high)
    {
        int[] brr = new int[arr.length];
        int i = low;
        int j = mid+1;
        int k = low;
        while (i <= mid && j <= high)
        {
            if(arr[i]<arr[j])
            {
                brr[k] = arr[i];
                i++;
            }else {
                brr[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i > mid)
        {
            while(j<=high)
            {
                brr[k] = arr[j];
                j++;k++;
            }
        }else {
            while(i<=mid)
            {
                brr[k] = arr[i];
                i++;k++;
            }
        }
    }

    static void merge(int arr[], int mid, int low, int high)
    {
        int []B = new int[20];
        int i, j, k;
        i = low;
        j = mid + 1;
        k = low;

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
package code.solution;
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
*/
package code.solution;
public class expert
{
    static void rootNum(int n)
    {
        int root = 0;
        for(int i=2;i<n;i++)
        {
            if(i*i==n)
            {
                root = i;
                break;
            }
        }
        System.out.println(root);
    }
    public static void main(String[] args)
    {
        int n=4;
        rootNum(n);
    }
}














