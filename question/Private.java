package question;

class ZeppelinLive {
    int year;
    private String location;

    ZeppelinLive(int year) {
        this.year = year;
        switch (year) {
            case 1971:
                this.location = "Paris Theatre";
                break;
            case 1973:
                this.location = "MSG";
                break;
            default:
                this.location = "Absence of bootlegs";
                break;
        }
    }

    public String toString() {
        return "year : " + this.year + ", location : "+ this.location;
    }
}

class Private {
    public static void main(String[] args) {
        ZeppelinLive b1 = new ZeppelinLive(1971);
        System.out.println(b1.toString());
    }
}