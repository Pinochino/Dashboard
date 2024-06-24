

import routeConfig from "~/configs/routeConfig";
import Contact from "~/pages/Contacts";
import Faq from "~/pages/Faq";
import Invoices from "~/pages/Invoices";
import Line from "~/pages/Line";
import Pie from "~/pages/Pie";
import Team from "~/pages/Team";
import Dashboard from "~/scenes/dashboard";

const publicRoutes = [
  {
    path: routeConfig.home,
    component: Dashboard,
  },
  {
    path: routeConfig.contact,
    component: Contact,
  },
  {
    path: routeConfig.faq,
    component: Faq,
  },
  {
    path: routeConfig.invoices,
    component: Invoices,
  },
  {
    path: routeConfig.line,
    component: Line,
  },
  {
    path: routeConfig.pie,
    component: Pie,
  },
  {
    path: routeConfig.team,
    component: Team,
  },
];

const privateRoutes = []

export {publicRoutes, privateRoutes}
