package Lession01;

import java.util.Scanner;

public class Lab01 {
    public static void  main(String[] args) {
        System.out.println("***** BÀI TẬP LAB01 *******");
        System.out.println("1.Đếm số chẵn và lẻ trong chuỗi");
        System.out.println("2.Tìm số lớn nhất/nhỏ nhất trong chuỗi");
        System.out.println("3.Tính trung bình cộng");
        System.out.println("4.Sắp xếp mảng tăng dần/ giảm dần");
        System.out.println("5.Tính giai thừa");
        System.out.println("--------------------------");
        Array();
        GiaiThua();
    }
    public static void Array()
    {
        int[] arr;
        System.out.print("Nhập số phần tử mảng:");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        arr = new int[n];
        //Nhập mảng phần tử
        for (int i = 0 ; i < arr.length; i++)
        {
            System.out.print("a["+i+"]=");
            arr[i] =  Integer.parseInt(scan.nextLine());
        }
        //Xuất mảng phần tử
        System.out.println("\n -----------------");
        System.out.println("Số phần tử của mảng: " + arr.length);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("\t"+arr[i]);
        }
        //Đếm số chẵn số lẻ trong mảng
        int oddarr[] = new int[n]; //khai báo mảng số lẻ
        int evenarr[] = new int[n]; // khai báo mảng số chẵn
        int oddnumber = 0; // khai báo số chẵn
        int evennumber = 0; //khai báo số lẻ
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 ==0) //duyệt mảng để kiểm tra số chia hết cho 2 (số chẵn)
            {
                evenarr[evennumber] = arr[i]; //nếu thoả điều kiện thì thêm số chẵn vào mảng số chẳn
                evennumber++;
            }
            else
            {
                oddarr[oddnumber] = arr[i]; //ngược lại nếu k thoả điều kiện if ở trên thì thêm vào mảng số lẻ
                oddnumber++;
            }
        }
        System.out.println("\n -----------------");
        System.out.println("\n Số chẵn của mảng là: ");
        for (int i = 0; i < evennumber; i++)
        {
            System.out.print(evenarr[i] + "\t");
        }
        System.out.println("\n -----------------");
        System.out.println("\n Số lẻ của mảng là: ");
        for (int i = 0; i < oddnumber; i++) {
            System.out.print(oddarr[i] + "\t");
        }

        //Tính tổng mảng
        int s = 0;
        for (int pt : arr)
        {
            s = s + pt;
        }
        double average = s / arr.length;
        System.out.println("\n -----------------");
        System.out.println("\n"+ "Tổng mảng:" +s);
        System.out.println("\n -----------------");
        System.out.format("Trung bình cộng của mảng là: %.3f", average);
        // Sắp xếp mảng tăng dần Selection Sort
        int i, j;
        int min, temp;
        for (i = 0; i < arr.length -1; i++)
        {
            min = i; //đặt giả định biến i đầu mảng là số nhỏ nhất = min
            for (j = i + 1; j < arr.length; j++)
            {
                if (arr[j] < arr[min]) //so sánh biến i và biến j , nếu j nhỏ hơn i (min) thì lúc này min =
                {
                    min = j;
                }
            }
            temp = arr[i];   //thưc hiện thao tác hoán đổi vị trí biến i và j, thông qua biến tạm tên là temp
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("\n -----------------");
        System.out.println("\n Mảng sau khi sắp xếp tăng dần: ");
        for (i = 0; i < n; i++)
        {
            System.out.print("\t"+arr[i]);
        }
        //Sắp xếp mảng giảm dần
        int max;
        for (i = 0; i < arr.length -1; i++)
        {
            min = i;
            for (j = i + 1; j < arr.length; j++)
            {
                if (arr[j] > arr[min])
                {
                    min = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("\n -----------------");
        System.out.println("\n Mảng sau khi sắp xếp giảm dần: ");
        for (i = 0; i < n; i++)
        {
            System.out.print("\t"+arr[i]);
        }
    }
    public static void GiaiThua()
    {
        System.out.print("\n Nhập số giai thừa :");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        long result = 1;
        for (int i = 1; i <= n; i++)
        {
            result = result * i;
        }
        System.out.println("\n -----------------");
        System.out.println("Giai thừa của "+n+" là :"+result);
    }
}
