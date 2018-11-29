$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test/groups.feature");
formatter.feature({
  "line": 1,
  "name": "for test",
  "description": "some test",
  "id": "for-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2278373100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create new group",
  "description": "",
  "id": "for-test;create-new-group",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logon as admin",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user go to group page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on create group button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user create group with name \"name_1\", header \"header_1\", footer \"footer_1\"",
  "keyword": "When "
});
formatter.match({
  "location": "GroupsSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 181125400,
  "status": "passed"
});
formatter.match({
  "location": "GroupsSteps.userLogonAsAdmin()"
});
formatter.result({
  "duration": 279446800,
  "status": "passed"
});
formatter.match({
  "location": "GroupsSteps.userGoToGroupPage()"
});
formatter.result({
  "duration": 94820100,
  "status": "passed"
});
formatter.match({
  "location": "GroupsSteps.userClickOnCreateGroupButton()"
});
formatter.result({
  "duration": 70503100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name_1",
      "offset": 29
    },
    {
      "val": "header_1",
      "offset": 46
    },
    {
      "val": "footer_1",
      "offset": 65
    }
  ],
  "location": "GroupsSteps.userCreateGroupWithNameHeaderFooter(String,String,String)"
});
formatter.result({
  "duration": 228076400,
  "status": "passed"
});
formatter.after({
  "duration": 22340400,
  "status": "passed"
});
formatter.uri("test/groupsNew.feature");
formatter.feature({
  "line": 1,
  "name": "for test 1",
  "description": "some test 1",
  "id": "for-test-1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1887253000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Create new group NEW",
  "description": "",
  "id": "for-test-1;create-new-group-new",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user logon as admin",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user go to group page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user click on create group button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user create group with name \"name_1\", header \"header_1\", footer \"footer_1\"",
  "keyword": "When "
});
formatter.match({
  "location": "GroupsSteps.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 88539000,
  "status": "passed"
});
formatter.match({
  "location": "GroupsSteps.userLogonAsAdmin()"
});
formatter.result({
  "duration": 265264400,
  "status": "passed"
});
formatter.match({
  "location": "GroupsSteps.userGoToGroupPage()"
});
formatter.result({
  "duration": 76486300,
  "status": "passed"
});
formatter.match({
  "location": "GroupsSteps.userClickOnCreateGroupButton()"
});
formatter.result({
  "duration": 80136400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name_1",
      "offset": 29
    },
    {
      "val": "header_1",
      "offset": 46
    },
    {
      "val": "footer_1",
      "offset": 65
    }
  ],
  "location": "GroupsSteps.userCreateGroupWithNameHeaderFooter(String,String,String)"
});
formatter.result({
  "duration": 243171400,
  "status": "passed"
});
formatter.after({
  "duration": 26100800,
  "status": "passed"
});
});