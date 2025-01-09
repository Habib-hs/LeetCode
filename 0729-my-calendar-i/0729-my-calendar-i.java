class MyCalendar {

     private List<int[]> calendar; // To store events as [start, end].

    public MyCalendar() {
        calendar = new ArrayList<>(); // Initialize an empty list.
    }
    
    public boolean book(int startTime, int endTime) {
       for (int[] event : calendar) {
            if (Math.max(event[0], startTime) < Math.min(event[1], endTime)) {
                return false;
            }
        }
        calendar.add(new int[]{startTime, endTime}); // Add new event.
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */