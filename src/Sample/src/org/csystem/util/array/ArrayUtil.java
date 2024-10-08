/**
 * Utility class for array operations
 * Last Update: 5th September 2024
 * @author Java-Jan-2024 Group
 */
package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length -1 - i; ++k)
                if (a[k + 1] < a[k])
                    swap(a, k, k + 1);
    }

    public static void bubbleSortDescending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length -1 - i; ++k)
                if (a[k] < a[k + 1])
                    swap(a, k, k + 1);
    }

    public static void selectionSortAscending(int [] a)
    {
        int min, minIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            min = a[i];
            minIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (a[k] < min) {
                    min = a[k];
                    minIndex = k;
                }
            a[minIndex] = a[i];
            a[i] = min;
        }
    }

    public static void selectionSortDescending(int [] a)
    {
        int max, maxIndex;

        for (int i = 0; i < a.length - 1; ++i) {
            max = a[i];
            maxIndex = i;

            for (int k = i + 1; k < a.length; ++k)
                if (max < a[k]) {
                    max = a[k];
                    maxIndex = k;
                }
            a[maxIndex] = a[i];
            a[i] = max;
        }
    }

    public static void bubbleSort(int [] a)
    {
        bubbleSort(a, false);
    }

    public static void bubbleSort(int [] a, boolean descending)
    {
        if (descending)
            bubbleSortDescending(a);
        else
            bubbleSortAscending(a);
    }

    public static int [] generateRandomArray(Random random, int count, int origin, int bound)
    {
        int [] a = new int[count];

        for (int i = 0; i < count; ++i)
            a[i] = random.nextInt(origin, bound);

        return a;
    }

    public static double [] generateRandomArray(Random random, int count, double origin, double bound)
    {
        double [] a = new double[count];

        for (int i = 0; i < count; ++i)
            a[i] = random.nextDouble(origin, bound);

        return a;
    }

    public static boolean [] generateRandomArray(Random random, int count)
    {
        boolean [] a = new boolean[count];

        for (int i = 0; i < count; ++i)
            a[i] = random.nextBoolean();

        return a;
    }

    public static int [] histogramData(int [] a, int n)
    {
        int [] data = new int[n + 1];

        for (int i = 0; i < a.length; ++i)
            ++data[a[i]];

        return data;
    }

    public static int max(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.max(result, a[i]);

        return result;
    }

    public static int max(int [] a, int startIndex)
    {
        int result = a[startIndex];

        for (int i = startIndex + 1; i < a.length; ++i)
            result = Math.max(result, a[i]);

        return result;
    }

    public static int min(int [] a)
    {
        int result = a[0];

        for (int i = 1; i < a.length; ++i)
            result = Math.min(result, a[i]);

        return result;
    }

    public static int min(int [] a, int startIndex)
    {
        int result = a[startIndex];

        for (int i = startIndex + 1; i < a.length; ++i)
            result = Math.min(result, a[i]);

        return result;
    }

    public static int partition(int [] a, int threshold)
    {
        int partitionPoint = 0;

        while (partitionPoint != a.length && a[partitionPoint] < threshold)
            ++partitionPoint;

        if (partitionPoint == a.length)
            return partitionPoint;

        for (int i = partitionPoint + 1; i < a.length; ++i)
            if (a[i] < threshold)
                swap(a, i, partitionPoint++);

        return partitionPoint;
    }

    public static int partitionByEven(int [] a)
    {
        int partitionPoint = 0;

        while (partitionPoint != a.length && a[partitionPoint] % 2 == 0)
            ++partitionPoint;

        if (partitionPoint == a.length)
            return partitionPoint;

        for (int i = partitionPoint + 1; i < a.length; ++i)
            if (a[i] % 2 == 0)
                swap(a, i, partitionPoint++);

        return partitionPoint;
    }

    public static void print(int [] a)
    {
        print(a, ' ', '\n');
    }

    public static void print(int [] a, char sep, char end)
    {
        print(a, 1, sep, end);
    }

    public static void print(int [] a, int n)
    {
        print(a, n, ' ', '\n');
    }

    public static void print(int [] a, int n, char sep, char end)
    {
        String fmt = String.format("%%0%dd%c", n, sep);

        for (int i = 0; i < a.length; ++i)
            System.out.printf(fmt, a[i], sep);

        System.out.print(end);
    }

    public static void print(double [] a)
    {
        print(a, '\n', '\n');
    }

    public static void print(double [] a, char sep, char end)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%f%c", a[i], sep);

        System.out.print(end);
    }

    public static void selectionSort(int [] a)
    {
        selectionSort(a, false);
    }

    public static void selectionSort(int [] a, boolean descending)
    {
        if (descending)
            selectionSortDescending(a);
        else
            selectionSortAscending(a);
    }
    public static long sum(int [] a)
    {
        long total = 0;

        for (int i = 0; i < a.length; ++i)
            total += a[i];

        return total;
    }

    public static void swap(int [] a, int i, int k)
    {
        int temp = a[i];

        a[i] = a[k];
        a[k] = temp;
    }

    //...
}
