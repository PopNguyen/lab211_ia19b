/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Utils {

    static Scanner sc = new Scanner(System.in);

    static String checkMajor(String msg) {
        while (true) {
            String input;
            try {
                System.out.println(msg);
                input = sc.nextLine();
                if (!(input.length() <= 30)) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Error");
            }

        }
    }

    static String checkPhone(String msg) {
        while (true) {
            String input;
            try {
                System.out.println(msg);
                input = sc.nextLine();
                if (!(input.matches("\\d{12}"))) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
            }

        }
    }

    static int checkID(String msg) {
        while (true) {
            int v = 0;
            try {
                System.out.println(msg);
                v = sc.nextInt();
                sc.nextLine();
                if (!(v>99999&&v<1000000)) {
                    throw new Exception("Error");
                }
                return v;
            } catch (Exception e) {
                System.out.println("Error");
                sc.nextLine();

            }

        }
    }

    static String checkName(String msg) {
        while (true) {
            String input;
            try {
                System.out.println(msg);
                input = sc.nextLine();
                if (!(input.trim().matches("[a-zA-Z ]+"))) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Input not valid.");
            }

        }
    }

    static int checkYearBirth(String msg) {
        while (true) {
            int input;
            try {
                System.out.println(msg);
                input = sc.nextInt();
                sc.nextLine();
                if (input > 2025) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
                System.out.println("Input not valid.");
            }
        }
    }

    static int checkYearProfession(String msg) {
        Teacher teacher = new Teacher();
        while (true) {
            try {
                System.out.println(msg);
                int input = sc.nextInt();
                sc.nextLine();
                if (!(input >= 0 && input <= 2025 - teacher.getYearOfBirth())) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
            }

        }
    }

    static String checkContract(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String input = sc.nextLine();
                if (!(input.equalsIgnoreCase("long") || input.equalsIgnoreCase("short"))) {
                    throw new Exception("Input not valid.");
                }
                return input;
            } catch (Exception e) {
            }

        }
    }

    static int checkYearAdmission(String msg) {
        Student2 student = new Student2();
        while (true) {
            int input;
            try {
                System.out.println(msg);
                input = sc.nextInt();
                if (input > student.getYearOfBirth() && input < 2025) {
                    return input;
                }
                throw new Exception("Input not valid.");
            } catch (Exception e) {
            }

        }
    }

    static String checkString(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    static int checkInt(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                int value = sc.nextInt();
                if (value < 0) {
                    throw new Exception("Error!!!");
                }
                return value;
            } catch (Exception e) {
                System.out.println("Error!!!");
            }

        }
    }

    static double checkSalary(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                double value = sc.nextDouble();
                if (value < 0) {
                    throw new Exception("Error!!!");
                }
                return value;
            } catch (Exception e) {
                System.out.println("Error!!!");
            }

        }
    }

    static int checkScore(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                int v = sc.nextInt();
                if (v >= 0 && v <= 100) {
                    return v;
                }
                throw new Exception("Input not valid.");
            } catch (Exception e) {
            }

        }
    }
}
