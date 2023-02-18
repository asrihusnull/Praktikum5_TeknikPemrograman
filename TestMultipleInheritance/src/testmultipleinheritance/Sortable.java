/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmultipleinheritance;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 17/02/2023
 */
abstract class Sortable {
        public abstract int compare(Sortable b);
        public static void shell_sort(Sortable[] a){
            //Shell sort body
            int n  = a.length;
		 for (int gap = n/2; gap > 0; gap /= 2) {
	            for (int i = gap; i < n; i++) {
	                Sortable temp = a[i];
	                int j;
	                for (j = i; j >= gap && a[j - gap].compare(temp) >   0; j -= gap) {
	                    a[j] = a[j - gap];
	                }
	                a[j] = temp;
	            }
	     }
        }
        public static void printPerson(Sortable[] p){
            for(Sortable person : p){
                System.out.println(p);
            }
        }
    }
