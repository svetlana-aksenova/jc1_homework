package homework3.task25;

import java.util.ArrayList;

public class Atm {

    private int banknote20;
    private int banknote50;
    private int banknote100;
    private int total;

    public Atm(int note20, int note50, int note100) {
        if (note20 < 0 || note50 < 0 || note100 < 0) {
            System.out.println("Enter correct data");
        } else {
            banknote20 += note20;
            banknote50 += note50;
            banknote100 += note100;
        }
    }

    public String getTotal() {
        total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        return "Your balance: " + total;
    }

    public void addMoney(int note20, int note50, int note100) {
        banknote20 += note20;
        banknote50 += note50;
        banknote100 += note100;
    }

    public void add20(int note20) {
        banknote20 += note20;
    }

    public void add50(int note50) {
        banknote50 += note50;
    }

    public void add100(int note100) {
        banknote100 += note100;
    }

    public ArrayList withdrawMoney() {
        total = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        ArrayList list = new ArrayList();
        UserDisplay userDisplay = new UserDisplay();
        int sum = userDisplay.readData();

        if (sum <= total) {
            if (sum % 10 != 0 || sum % 100 == 10 || sum % 100 == 30 || sum < 20) {
                list.add("Operation failed. Enter another amount");
            }
            int option;
            if (sum >= 100) {
                if (sum % 100 == 0) {
                    option = 1;
                } else if (sum % 50 == 0) {
                    option = 2;
                } else {
                    option = 3;
                }
            } else if (sum < 100 && sum >= 20) {
                option = 4;
            } else {
                option = 5;
            }

            switch (option) {
                case 1:
                    int m = sum / 100;
                    if (m <= banknote100) {
                        list.add("The operation was successful");
                        list.add("\nbanknotes 100 * " + m);
                        banknote100 = banknote100 - m;
                        total = total - sum;
                    } else {
                        int n = (sum - banknote100 * 100) / 50;
                        if (n <= banknote50) {
                            list.add("The operation was successful");
                            list.add("\nbanknotes 100 * " + banknote100 + "," + " banknotes 50 * " + n);
                            banknote100 = banknote100 - banknote100;
                            banknote50 = banknote50 - n;
                            total = total - sum;
                        } else {
                            if (banknote50 % 2 == 0) {
                                int l = (sum - banknote100 * 100 - banknote50 * 50) / 20;
                                if (l <= banknote20) {
                                    list.add("The operation was successful");
                                    list.add("\nbanknotes 100 * " + banknote100 + "," + " banknotes 50 * " + banknote50
                                            + "," + " banknotes 20 * " + l);
                                    banknote100 = banknote100 - banknote100;
                                    banknote50 = banknote50 - banknote50;
                                    banknote20 = banknote20 - l;
                                    total = total - sum;
                                } else {
                                    list.add("Operation failed. Not enough banknotes. Please enter another amount");
                                }
                            } else {
                                int l = (sum - banknote100 * 100 - (banknote50 - 1) * 50) / 20;
                                if (l <= banknote20) {
                                    list.add("The operation was successful");
                                    list.add("\nbanknotes 100 * " + banknote100 + "," + " banknotes 50 * " +
                                            (banknote50 - 1) + "," + " banknotes 20 * " + l);
                                    banknote100 = banknote100 - banknote100;
                                    banknote50 = banknote50 - (banknote50 - 1);
                                    banknote20 = banknote20 - l;
                                    total = total - sum;
                                }
                            }
                        }
                    }
                    break;

                case 2:
                    int a = sum / 100;
                    if (a <= banknote100) {
                        int b = (sum - 100 * a) / 50;
                        if (b <= banknote50) {
                            list.add("The operation was successful");
                            list.add("\nbanknote 100 * " + a + "," + "banknote 50 * " + b);
                            banknote100 = banknote100 - a;
                            banknote50 = banknote50 - b;
                            total = total - sum;
                        } else {
                            list.add("Operation failed. Not enough banknotes. Please enter another amount");
                        }
                    } else {
                        int b = (sum - 100 * banknote100) / 50;
                        if (b <= banknote50) {
                            list.add("The operation was successful");
                            list.add("\nbanknote 100 * " + banknote100 + "," + " banknote 50 * " + b);
                            banknote100 = banknote100 - banknote100;
                            banknote50 = banknote50 - b;
                            total = total - sum;
                        } else {
                            list.add("Operation failed. Not enough banknotes. Please enter another amount");
                        }
                    }
                    break;

                case 3:
                    int c = sum / 100;
                    if (c <= banknote100) {
                        int d = (sum - c * 100) / 50;
                        if (d <= banknote50) {
                            int e = (sum - c * 100 - d * 50) / 20;
                            if (e <= banknote20) {
                                list.add("The operation was successful");
                                list.add("\nbanknotes 100 * " + c + "," + " banknotes 50 * " +
                                        d + "," + " banknotes 20 * " + e);
                                banknote100 = banknote100 - c;
                                banknote50 = banknote50 - d;
                                banknote20 = banknote20 - e;
                                total = total - sum;
                            } else {
                                list.add("Operation failed. Not enough banknotes. Please enter another amount");
                            }
                        } else {
                            if (banknote50 % 2 == 0) {
                                int e = (sum - c * 100 - banknote50 * 50) / 20;
                                if (e <= banknote20) {
                                    list.add("The operation was successful");
                                    list.add("\nbanknotes 100 * " + c + "," + " banknotes 50 * " +
                                            banknote50 + "," + " banknotes 20 * " + e);
                                    banknote100 = banknote100 - c;
                                    banknote50 = banknote50 - banknote50;
                                    banknote20 = banknote20 - e;
                                    total = total - sum;
                                } else {
                                    list.add("Operation failed. Not enough banknotes. Please enter another amount");
                                }
                            } else {
                                int e = (sum - c * 100 - (banknote50 - 1) * 50) / 20;
                                if (e <= banknote20) {
                                    list.add("The operation was successful");
                                    list.add("\nbanknotes 100 * " + c + "," + " banknotes 50 * " +
                                            (banknote50 - 1) + "," + " banknotes 20 * " + e);
                                    banknote100 = banknote100 - c;
                                    banknote50 = banknote50 - (banknote50 - 1);
                                    banknote20 = banknote20 - e;
                                    total = total - sum;
                                } else {
                                    list.add("Operation failed. Not enough banknotes. Please enter another amount");
                                }
                            }
                        }
                    } else {
                        int d = (sum - banknote100 * 100) / 50;
                        if (d <= banknote50) {
                            int e = (sum - banknote100 * 100 - d * 50) / 20;
                            if (e <= banknote20) {
                                list.add("The operation was successful");
                                list.add("\nbanknotes 100 * " + banknote100 + "," + " banknotes 50 * " +
                                        d + "," + " banknotes 20 * " + e);
                                banknote100 = banknote100 - banknote100;
                                banknote50 = banknote50 - d;
                                banknote20 = banknote20 - e;
                                total = total - sum;
                            } else {
                                list.add("Operation failed. Not enough banknotes. Please enter another amount");
                            }
                        } else {
                            if (banknote50 % 2 == 0) {
                                int e = (sum - 100 * banknote100 - 50 * banknote50) / 20;
                                if (e <= banknote20) {
                                    list.add("The operation was successful");
                                    list.add("\nbanknotes 100 * " + banknote100 + "," + " banknotes 50 * " +
                                            banknote50 + "," + " banknotes 20 * " + e);
                                    banknote100 = banknote100 - banknote100;
                                    banknote50 = banknote50 - banknote50;
                                    banknote20 = banknote20 - e;
                                    total = total - sum;
                                } else {
                                    list.add("Operation failed. Not enough banknotes. Please enter another amount");
                                }
                            } else {
                                int e = (sum - 100 * banknote100 - 50 * (banknote50 - 1)) / 20;
                                if (e <= banknote20) {
                                    list.add("The operation was successful");
                                    list.add("\nbanknotes 100 * " + banknote100 + "," + " banknotes 50 * " +
                                            (banknote50 - 1) + "," + " banknotes 20 * " + e);
                                    banknote100 = banknote100 - banknote100;
                                    banknote50 = banknote50 - (banknote50 - 1);
                                    banknote20 = banknote20 - e;
                                    total = total - sum;
                                } else {
                                    list.add("Operation failed. Not enough banknotes. Please enter another amount");
                                }
                            }
                        }
                    }

                    break;

                case 4:
                    if (sum % 20 == 0) {
                        int s = sum / 20;
                        if (s <= banknote20) {
                            list.add("The operation was successful");
                            list.add("\nbanknotes 20 * " + s);
                            banknote20 = banknote20 - s;
                            total = total = sum;
                        } else {
                            list.add("Operation failed. Not enough banknotes. Please enter another amount");
                        }
                    } else {
                        int s = (sum - 50) / 20;
                        if (banknote50 > 0 && s <= banknote20) {
                            list.add("The operation was successful");
                            list.add("\nbanknotes 50 * " + 1 + "," + " banknote 20 * " + s);
                            banknote50--;
                            banknote20 = banknote20 - s;
                            total = total = sum;
                        } else {
                            list.add("Operation failed. Not enough banknotes. Please enter another amount");
                        }
                    }


            }
        } else {
            list.add("Operation failed. Insufficient funds");
        }
        return list;
    }

}
