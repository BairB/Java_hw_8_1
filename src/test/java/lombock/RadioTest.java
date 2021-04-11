//package lombock;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//class RadioTest {
//
//    @Test
//    public void showStationWhenClickNext() {
//        Radio radio = new Radio(4, 10, 0, 4 ,100, 0);
//        int actual = (int) radio.findCurrentStation(4);
//        assertEquals(4, actual);
//        //assertEquals(0, radio.findCurrentStation(radio.setCurrentStation(10)));
//    }
//
//    @Test
//    public void showStationWhenClickPrev() {
//        Radio radio = new Radio(5, 10, 0, 4 ,100, 0);
//        //int station = -1;
//        int actual = (int) radio.findCurrentStation(5);
//        assertEquals(5, actual);
//        // assertEquals(9, radio.findCurrentStation(radio.setCurrentStation(-1)));
//    }
//
//    @Test
//    public void showCurrentStation() {
//        Radio radio = new Radio(6, 10, 0, 4 ,100, 0);
//        //int expected = 5;
//        radio.setCurrentStation(6);
//        assertEquals(6, radio.getCurrentStation());
//    }
//
//    @Test
//    public void shouldNotChangeVolumeWhenPressPlus() {
//        Radio radio = new Radio(4, 10, 0, 100 ,100, 0);
//        assertEquals(100, radio.findVolume(radio.setVolume(100)));
//    }
//
//    @Test
//    public void shouldNotChangeVolumeWhenPressMinus() {
//        Radio radio = new Radio(4, 10, 0, 0 ,100, 0);
//        assertEquals(0, radio.findVolume(radio.setVolume(0)));
//    }
//
//    @Test
//    public void showCurrentVolume() {
//        Radio radio = new Radio(4, 10, 0, 60 ,100, 0);
//        //int expected = 6;
//        radio.setVolume(60);
//        assertEquals(60, radio.getVolume());
//    }
//
//    @Test
//    public void shouldIncreaseStationNumber() {
//        Radio radio = new Radio(4, 10, 0, 4 ,100, 0);
//        radio.setCurrentStation(7);
//        int actual = radio.increaseStationNumber();
//        assertEquals(8, actual);
//    }
//
//    @Test
//    public void increaseStationNumberIfMax() {
//        Radio radio = new Radio(10, 10, 0, 4 ,100, 0);
//        //radio.setCurrentStation(9);
//        //int actual = radio.increaseStationNumber();
//        assertEquals(0, radio.increaseStationNumber());
//    }
//
//    @Test
//    public void shouldDecreaseStationNumber() {
//        Radio radio = new Radio(8, 10, 0, 4 ,100, 0);
//        //radio.setCurrentStation(8);
//        //int actual = radio.decreaseStationNumber();
//        assertEquals(7, radio.decreaseStationNumber());
//    }
//
//    @Test
//    public void decreaseStationNumberIfMin() {
//        Radio radio = new Radio(0, 10, 0, 4 ,100, 0);
//        //radio.setCurrentStation(0);
//        //int actual = radio.decreaseStationNumber();
//        assertEquals(10, radio.decreaseStationNumber());
//    }
//
//    @Test
//    public void shouldIncreaseVolume() {
//        Radio radio = new Radio(5, 10, 0, 50 ,100, 0);
//        //radio.setCurrentStation(5);
//        //int actual = radio.increaseVolume();
//        assertEquals(51, radio.increaseVolume());
//    }
//
//    @Test
//    public void increaseVolumeIfMax() {
//        Radio radio = new Radio(5, 10, 0, 100 ,100, 0);
//        //radio.setVolume(10);
//        //int actual = radio.increaseVolume();
//        assertEquals(100, radio.increaseVolume());
//    }
//
//    @Test
//    public void shouldDecreaseVolume() {
//        Radio radio = new Radio(5, 10, 0, 60 ,100, 0);
//        //radio.setVolume(8);
//        //int actual = radio.decreaseVolume();
//        assertEquals(59, radio.decreaseVolume());
//    }
//
//    @Test
//    public void decreaseVolumeIfMin() {
//        Radio radio = new Radio(5, 10, 0, 0 ,100, 0);
//        //radio.setVolume(0);
//        //int actual = radio.decreaseVolume();
//        assertEquals(0, radio.decreaseVolume());
//    }
//}