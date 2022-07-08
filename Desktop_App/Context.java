package Desktop_App;
import SQL_Database.dao.*;
import SQL_Database.userDaoImpl.*;

public class Context {
    public static CountryInterface instanceCountryDao() {
        return new CountryDaoImpl();
    }

    public static EmploymentHistoryInterface instanceEmploymentHistoryDao() {
        return new EmploymentHistoryDaoImpl();
    }

    public static SkillInterface instanceSkillDao() {
        return new SkillDaoImpl();
    }

    public static UserInterface instanceUserDao() {
        return new UserDaoImpl();
    }

    public static UserSkillInterface instanceUserSkillDao() {
        return new UserSkillDaoImpl();
    }

    public static NationalityInterface instanceNationalityDao() {
        return new NationalityDaoImpl();
    }
}
