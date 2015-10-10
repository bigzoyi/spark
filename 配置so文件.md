1、 找到 config category="yarn-site.xml" format="genericxmlconfigurer"
     
    <property type="advanced" scope="hiddenInstance" classification="System">
      <name>yarn.nodemanager.admin-env</name>
        <value vType="string">LD_LIBERY_PATH=so目录</value>
         <description>
          [Desc] path for ldlibrary.
           [Default] 描述
          </description>
    </property>	


2、
/sbin/stop-controller.sh 
/sbin/start-controller.sh
