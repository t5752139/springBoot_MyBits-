
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import com.ky.jyg.userCenter.company.pojo.Company;

public class GeneratorSqlmap {

	public void generator() throws Exception {

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		// 指定 逆向工程配置文件
		File configFile = new File("D:\\idea_work\\springBoot_MyBits-\\generatorSqlmapCustom\\generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);

	}
//	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {  
//      if (suppressAllComments) {  
//          return;  
//      }  
//
//      StringBuilder sb = new StringBuilder();  
//
//      field.addJavaDocLine("/**");  
//      sb.append(" * ");  
//      sb.append(introspectedColumn.getRemarks());  
//      field.addJavaDocLine(sb.toString());  
//
//      addJavadocTag(field, false);  
//
//      field.addJavaDocLine(" */");  
//  } 
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
