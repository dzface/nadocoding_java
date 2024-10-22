package chap_00;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;
import java.util.Arrays;

public class MemoryCheck {
    public String[] getMemory() {
        MemoryMXBean membean = (MemoryMXBean) ManagementFactory.getMemoryMXBean();
        MemoryUsage heap = membean.getHeapMemoryUsage();
        MemoryUsage nonheap = membean.getNonHeapMemoryUsage();
        long heapInit = heap.getInit();
        long heapUsed = heap.getUsed();
        long heapCommit = heap.getCommitted();
        long heapMax = heap.getMax();

        long nonheapUsed = nonheap.getUsed();
        String[] list = new String[5];
//		list[0] = String.valueOf(heapInit);
        list[0] = String.valueOf(heapUsed);
        list[1] = String.valueOf(nonheapUsed);
//		list[2] = String.valueOf(heapCommit);
//		list[3] = String.valueOf(heapMax);
        return list;
    }

    public static void main(String[] args) {
        MemoryCheck m1 = new MemoryCheck();
        for(String item : m1.getMemory()) {
            System.out.println(item);
        }

    }
};
