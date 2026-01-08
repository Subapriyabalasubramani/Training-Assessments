**1. List all employees with their department name and location.**

&nbsp;   select e.emp\_name, e.job\_title, e.salary, e.hire\_date, d.dept\_name,   d.location

&nbsp;   from emp\_details e, department d

&nbsp;   where e.dept\_id = d.dept\_id;


**2. List employees who are assigned to a project, showing employee name + project name + role.**

&nbsp;    select e.emp\_name, pr.project\_name, p.role\_name

&nbsp;   from emp\_details e

&nbsp;    inner join exp\_project p

&nbsp;    on e.emp\_id = p.emp\_id

&nbsp;    inner join project pr

&nbsp;    on p.project\_id = pr.project\_id;

**3. Show all departments, and employee names if present (departments with no employees must appear).**
     select d.dept\_name, e.emp\_name

&nbsp;    from department d

&nbsp;    left outer join emp\_details e

&nbsp;    on d.dept\_id = e.dept\_id;

**4. Show all projects, and assigned employee names if present (projects with no employees must appear).** 

&nbsp;      select

&nbsp;      p.project\_name,

&nbsp;      e.emp\_name

&nbsp;      from project p

&nbsp;      left outer join exp\_project ep

&nbsp;      on p.project\_id = ep.project\_id

&nbsp;      left outer join emp\_details e

&nbsp;      on ep.emp\_id = e.emp\_id;


**5. Show all employees, including those without a department (dept fields can be null).**

&nbsp;     select e.emp\_name, d.dept\_name

&nbsp;     from emp\_details e

&nbsp;     right outer join department d

&nbsp;     on e.dept\_id = d.dept\_id;

**6. Show all departments and all employees, even when there is no match (unmatched rows from both sides)**
       select e.emp\_name, d.dept\_name

&nbsp;      from emp\_details e

&nbsp;      full outer join department d

&nbsp;      on e.dept\_id = d.dept\_id;

**7. Create a “planning matrix”: every department combined with every salary grade.**

&nbsp;     select d.dept\_name, d.location, s.min\_sal, s.max\_sal

&nbsp;     from department d

&nbsp;     cross join sal\_grade s;


**8. Show employee name and their manager name (employees without manager should still show).**

&nbsp;      select e.emp\_name, m.emp\_name

&nbsp;      from emp\_details e

&nbsp;      left outer join emp\_details m

&nbsp;      on e.emp\_id = m.manager\_id;

**9. Join emp and dept using dept\_id with USING (dept\_id) and display columns cleanly.**
      select emp\_name, dept\_name, location

&nbsp;     from emp\_details

&nbsp;     inner join department

&nbsp;     using(dept\_id);

**10. Assign a grade to each employee based on salary using sal\_grade (salary between min\_sal and max\_sal).**

&nbsp;    select e.emp\_name, e.salary, s.grade

&nbsp;    from emp\_details e

&nbsp;    join sal\_grade s

&nbsp;    on e.salary between s.min\_sal and s.max\_sal;

