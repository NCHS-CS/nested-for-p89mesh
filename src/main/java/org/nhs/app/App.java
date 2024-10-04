/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package org.nhs.app;

// Parker Draheim P.6
// Created 10/4/2024, Edited 10/4/2024

public class App{

    public static void main(String[] args){
        //Problem 1
        for (int num = 1; num <=5; num++){
            for (int count = 1; count <= num; count++){
                System.out.print(num);
            }
        System.out.println("");
        }
        System.out.println("");


        //Problem 2
        for (int num = 1; num <=5; num++){
            for (int gear = 1; gear <= 5-num; gear++){
                System.out.print(".");
            }
            for (int count = 1; count <= num; count++){
                System.out.print(num);
            }
        System.out.println("");
        }
        System.out.println("");

        
        //Problem 3
        for (int num = 1; num <=5; num++){
            for (int gear = 1; gear <= 5-num; gear++){
                System.out.print(".");
            }
            for (int count = 1; count <= num; count++){
                if (count == 1){
                    System.out.print(num);
                }
                else{
                    System.out.print(".");
                }
            }
        System.out.println("");
        }
        System.out.println("");

        
        //Problem 4 (Challenge)
        for (int num = -8; num <=8; num++){
            for (int gear = 1; gear <= Math.abs(num); gear++){
                System.out.print(" ");
            }
            for (int count = 1; count <= 2 * (9-Math.abs(num)); count++){
                System.out.print(9-Math.abs(num));
            }
        System.out.println("");
        }
    }
}