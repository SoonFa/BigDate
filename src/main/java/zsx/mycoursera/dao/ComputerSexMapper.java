package zsx.mycoursera.dao;
        import org.apache.ibatis.annotations.Mapper;

        import java.util.List;
        import java.util.Map;
@Mapper
public interface ComputerSexMapper {
    List<Map<String,String>> getComputerSex();
}
