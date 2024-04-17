Pandemic Tracker
Build an application to calculate Pandemic risk ( e.g. Covid – we are 4 years too late for this ) for users where users can register and tell if they have any symptoms, travel history, or came in contact with any positive patient.
Based on which application will calculate and return the risk percentage of the user.

1)  User:
You need to provide following options for User:
Register: A user can register by providing name, mobile number and pincode. Consider phone number as unique.

Self Assessment: Users can enter below data :
Any symptoms (cough, sore throat, etc). ( list )
Any Travel history in the last 15 days. ( in form of Yes and No )
Any contact with Pandemic positive patients.  ( in form of Yes and No )

Assume symptoms be these :
cough
sore throat
headache
fever

Pandemic Risk: Users can see the risk of being affected by Pandemic based on self assessment.

Risk Calculation:
No symptoms, No travel history, No contact with Pandemic positive patient - Risk = 5%
Any one out of (symptoms, travel history or contact with Pandemic positive patient) is true - Risk = 50%
Any two out of (symptoms, travel history or contact with Pandemic positive patient) is true - Risk = 75%
More than 2 symptoms, travel history or contact with Pandemic positive patient is true - Risk = 95%


INPUT:

User capabilities
	
RegisterUser(ABC,9999999999,560037);

SelfAssessment(UserId, [ symptom 1 , symptom2  ]  , Yes, No );
OUTPUT:

Risk is 75%
2) Admin:
You need to provide Admin options for Pandemic Health workers:
Register: Pandemic Health workers can register by mobile number and pin code on user’s behalf
Pandemic Result: Health workers can enter the result of Pandemic tests for patients.
Health workers can also mark already registered users as Recovered.

INPUT:

Admin Capabilities :

RegisterUser(ABC,9999999999,560037);
PandemicResult(AdminId, UserId1, Y);
PandemicResult(AdminId, UserId2, Y);
PandemicResult(AdminId, UserId2, N);

AdminId: Please take Admin’s name as AdminId. No requirement of having uniqueness check on admin name/id.

OUTPUT:

Record of UserId saved successfully as Positive

Or

Record of UserId saved successfully as Negative
3) Zones:

Zone = pincode
Mark zones(pincodes) as green, orange and red based on positive Pandemic cases
Default zone - GREEN - <= 0 cases in that zone or no user has registered against that Zone.
>0 and <=5 cases in a zone - ORANGE
>5 cases in a zone - RED

Note : Please use only Admins inputs for calculating zones color


INPUT:
GetZone(560037);

OUTPUT:
No. of positive cases: 1
ORANGE
