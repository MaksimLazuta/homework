package Main;

public class Main {
    public static void main(String... args){
        Weather weatherInfoMonday = new Weather ();
        System.out.println("День недели: " + weatherInfoMonday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoMonday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoMonday.howItFeel);

        Weather weatherInfoTuesday = new Weather();
        weatherInfoTuesday.nameOfTheDay = "Вторник ";
        weatherInfoTuesday.temperature = 24 ;
        weatherInfoTuesday.howItFeel = "Ожидаются кратковревенные дожди, возьмите зонтик ";

        System.out.println("День недели: " + weatherInfoTuesday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoTuesday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoTuesday.howItFeel);

        Weather weatherInfoWednesday = new Weather();
        weatherInfoWednesday.nameOfTheDay = "Среда ";
        weatherInfoWednesday.temperature = 600 ;
        weatherInfoWednesday.howItFeel = " Запланирован метиоритный дождь, хавайся у бульбу, накрывайся бураками";

        System.out.println("День недели: " + weatherInfoWednesday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoWednesday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoWednesday.howItFeel);

        Weather weatherInfoThursday = new Weather();
        weatherInfoThursday.nameOfTheDay = "Четверг ";
        weatherInfoThursday.temperature = 0 ;
        weatherInfoThursday.howItFeel = " Ветерком с севера пригонит ледниковый период , П.С. Шуба не спасет";

        System.out.println("День недели: " + weatherInfoThursday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoThursday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoThursday.howItFeel);

        Weather weatherInfoFriday = new Weather();
        weatherInfoFriday.nameOfTheDay = "Пятница ";
        weatherInfoFriday.temperature = 25 ;
        weatherInfoFriday.howItFeel = " Если вы пережили эту неделю , то рекомендуется бутылка виски";

        System.out.println("День недели: " + weatherInfoFriday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoFriday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoFriday.howItFeel);

        Weather weatherInfoSaturday = new Weather();
        weatherInfoSaturday.nameOfTheDay = "Суббота ";
        weatherInfoSaturday.temperature = 18 ;
        weatherInfoSaturday.howItFeel = " Будет прохладно , поэтому советуем найти горячую компанию на вечер ";

        System.out.println("День недели: " + weatherInfoSaturday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoSaturday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoSaturday.howItFeel);

        Weather weatherInfoSunday = new Weather();
        weatherInfoSunday.nameOfTheDay = "Воскресенье ";
        weatherInfoSunday.temperature = 25 ;
        weatherInfoSunday.howItFeel = " Ну жто ж дорогой друг , поздравляем тебя , ты вышел из комы и тебе вся эта неделя просто приснилась , вставай с кровати , завтра на раоту ";

        System.out.println("День недели: " + weatherInfoSunday.nameOfTheDay);
        System.out.println("Температура: " + weatherInfoSunday.temperature);
        System.out.println("Рекомендаци: " + weatherInfoSunday.howItFeel);
    }
}
