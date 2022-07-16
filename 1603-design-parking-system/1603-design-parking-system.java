class ParkingSystem {

    int big,small,medium;
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
       int ct = carType;
        if(ct == 1 && big == 0 || ct == 2 && medium == 0 || ct == 3 && small == 0){
            return false;
        }
        if(ct == 1){
            big--;
        }
        if(ct == 2){
            medium--;
        }
        if(ct == 3){
            small--;
        }
       return true;
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */